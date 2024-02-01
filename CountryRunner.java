package com.xworkz.country.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.country.constants.ConnectionData;

public class CountryRunner {
	public static void main(String[] args) {
		String query="INSERT INTO country(country_name,population,area,is_landlocked,currency_code) values(?,?,?,?,?)";
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
				PreparedStatement preparedStatement=connection.prepareStatement(query);){
			 preparedStatement.setString(1, "India");
	            preparedStatement.setInt(2, 1380004385);
	            preparedStatement.setDouble(3, 3287263.26);
	            preparedStatement.setBoolean(4, false);
	            preparedStatement.setString(5, "INR");
			
			
			preparedStatement.executeUpdate();
			System.out.println("Inserted");

			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}



