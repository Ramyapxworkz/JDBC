package com.xworkz.bottle.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.bottle.constants.ConstantBottle;

public class BottleRunner {
	public static void main(String[] args) {
		try(Connection connection=DriverManager.getConnection(ConstantBottle.URL.getValue(), ConstantBottle.USERNAME.getValue(), ConstantBottle.PASSWORD.getValue());
				Statement statement=connection.createStatement()){
			System.out.println("class is connected");
			String query="INSERT INTO bottle_details values('Pepsi','Plastic',750)";
			//statement.execute(query);	
			int rs=statement.executeUpdate(query);
			if(rs==1) {
				System.out.println("is connected");
			}else {
				System.out.println("is not connectd");
			}
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}
	}

}
