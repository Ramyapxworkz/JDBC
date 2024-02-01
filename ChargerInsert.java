package com.xworkz.charger.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.charges.constants.ConnectionData;

public class ChargerInsert {
	public static void main(String[] args) {
		String query="INSERT INTO charger_table(charger_brand,Charger_capacity,fast_charger,price,model) values(?,?,?,?,?)";
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
				PreparedStatement preparedStatement=connection.prepareStatement(query);){
			preparedStatement.setString(1, "ABC Electronics");
			preparedStatement.setFloat(2, 1000);
			preparedStatement.setBoolean(3, true);
			preparedStatement.setDouble(4, 49.99);
			preparedStatement.setString(5, "Model XYZ");
			preparedStatement.executeUpdate();
			System.out.println("Inserted");

			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
