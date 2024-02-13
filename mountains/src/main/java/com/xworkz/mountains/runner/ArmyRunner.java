package com.xworkz.mountains.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.mountains.constants.ConnectionData;
import com.xworkz.mountains.dto.ArmyDto;

public class ArmyRunner {
	public static void main(String[] args) {
		ArmyDto army1 = new ArmyDto("United States Army", "United States", 1050000, "Army");
		ArmyDto army2 = new ArmyDto("Russian Ground Forces", "Russia", 900000, "Army");
		ArmyDto army3 = new ArmyDto("Indian Army", "India", 1395000, "Army");
		ArmyDto army4 = new ArmyDto("People's Liberation Army Ground Force", "China", 975000, "Army");
		ArmyDto army5 = new ArmyDto("Pakistan Army", "Pakistan", 650000, "Army");
		String query="INSERT INTO army_table (name,country,numberOfSoldiers,branch)VALUES(?,?,?,?)";
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(), ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
	    		PreparedStatement preparedStatement=connection.prepareStatement(query);){
			preparedStatement.setString(1, army1.getName());
			preparedStatement.setString(2, army1.getCountry());
			preparedStatement.setInt(3, army1.getNumberOfSoldiers());
			preparedStatement.setString(4, army1.getBranch());
			preparedStatement.executeUpdate();
			preparedStatement.addBatch();
			
			preparedStatement.setString(1, army2.getName());
			preparedStatement.setString(2, army2.getCountry());
			preparedStatement.setInt(3, army2.getNumberOfSoldiers());
			preparedStatement.setString(4, army2.getBranch());
			preparedStatement.executeUpdate();
			preparedStatement.addBatch();
			
			preparedStatement.setString(1, army1.getName());
			preparedStatement.setString(2, army1.getCountry());
			preparedStatement.setInt(3, army1.getNumberOfSoldiers());
			preparedStatement.setString(4, army1.getBranch());
			preparedStatement.executeUpdate();
			preparedStatement.addBatch();
			
			preparedStatement.setString(1, army3.getName());
			preparedStatement.setString(2, army3.getCountry());
			preparedStatement.setInt(3, army3.getNumberOfSoldiers());
			preparedStatement.setString(4, army3.getBranch());
			preparedStatement.executeUpdate();
			preparedStatement.addBatch();
			
			preparedStatement.setString(1, army4.getName());
			preparedStatement.setString(2, army4.getCountry());
			preparedStatement.setInt(3, army4.getNumberOfSoldiers());
			preparedStatement.setString(4, army4.getBranch());
			preparedStatement.executeUpdate();
			preparedStatement.addBatch();
			
			System.out.println("Inserted");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
