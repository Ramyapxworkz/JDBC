package com.xworkz.pen.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.pen.constants.ConstantsData;

public class PensRunner {
	public static void main(String[] args) {
		try(Connection connection=DriverManager.getConnection(ConstantsData.URL.getValue(), ConstantsData.USERNAME.getValue(), ConstantsData.PASSWORD.getValue());
				Statement statement=connection.createStatement()){
//			String query="INSERT INTO pen1_details(brand,color,ink_type)values('Pilot', 'Blue', 'Gel'),"
//					+ "('Bic', 'Black', 'Ballpoint'),('PaperMate', 'Red', 'Rollerball'),('Uni-ball', 'Green', 'Fountain'),('Sharpie', 'Purple', 'Permanent'),('Zebra', 'Orange', 'Gel'),('Montblanc', 'Black', 'Fountain'),"
//					+ "('Staedtler', 'Brown', 'Ballpoint'),('Faber-Castell', 'Blue', 'Rollerbal'),('Pentel', 'Pink', 'Gel'),('Sakura', 'Yellow', 'Fineliner'),('Copic', 'Gray', 'Alcohol-based'),"
//					+ "('Lamy', 'Turquoise', 'Fountain'),('Parker', 'Gold', 'Ballpoint'),('Muji', 'Clear', 'Gel'),('Stabilo', 'Lilac', 'Highlighter'),('Rotring', 'Silver', 'Technical'),"
//					+ "('Pelikan', 'Green', 'Fountain'),('Cross', 'Burgundy', 'Rollerball'),('Waterman', 'Royal Blue', 'Ballpoint')";
//			    statement.execute(query);
//			System.out.println("connected");
			String query="UPDATE pen1_details SET brand='Cross' WHERE brand='Stabilo'";
			int rs = statement.executeUpdate(query);
			if (rs == 1) {
				System.out.println("is connected");
			} else {
				System.out.println("is not connectd");
			}
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("connection is failed");
			
		}
	}

}

