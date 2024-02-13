package com.xworkz.mountains.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.mountains.constants.ConnectionData;
import com.xworkz.mountains.dto.OceansDto;

public class OceanRunner {
public static void main(String[] args) {
	OceansDto ocean1 = new OceansDto("Pacific Ocean", 10946, "Eastern Hemisphere");
	OceansDto ocean2 = new OceansDto("Atlantic Ocean", 8486, "Western Hemisphere");
    OceansDto ocean3 = new OceansDto("Indian Ocean", 7451, "Southern Hemisphere");
    String query="INSERT INTO ocean_table(name,depth,location)VALUES(?,?,?)";
    try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(), ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
    		PreparedStatement preparedStatement=connection.prepareStatement(query);){
    	preparedStatement.setString(1, ocean1.getName());
    	preparedStatement.setDouble(2, ocean1.getDepth());
    	preparedStatement.setString(3, ocean1.getLocation());
    	preparedStatement.executeUpdate();
    	preparedStatement.addBatch();
    	
    	preparedStatement.setString(1, ocean2.getName());
    	preparedStatement.setDouble(2, ocean2.getDepth());
    	preparedStatement.setString(3, ocean2.getLocation());
    	preparedStatement.executeUpdate();
    	preparedStatement.addBatch();
    	
    	preparedStatement.setString(1, ocean3.getName());
    	preparedStatement.setDouble(2, ocean3.getDepth());
    	preparedStatement.setString(3, ocean3.getLocation());
    	preparedStatement.executeUpdate();
    	preparedStatement.addBatch();
    	System.out.println("inserted"); 	
    	
}catch(SQLException e) {
	e.printStackTrace();
}
}
}
