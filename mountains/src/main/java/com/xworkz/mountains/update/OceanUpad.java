package com.xworkz.mountains.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.mountains.constants.ConnectionData;
import com.xworkz.mountains.dto.OceansDto;

public class OceanUpad {
	public static void main(String[] args) {
		OceansDto ocean2 = new OceansDto("Atlantic Ocean", 8486, "Western Hemisphere");		
		ocean2.setName("Arctic Ocean");
		String query="UPDATE ocean_table set name=? where depth=?";
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(), ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
	    		PreparedStatement preparedStatement=connection.prepareStatement(query);){
			preparedStatement.setString(1, ocean2.getName());
			preparedStatement.setDouble(2, ocean2.getDepth());
	    	
	    	preparedStatement.executeUpdate();
	    	System.out.println("update");
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
	}
	

}
