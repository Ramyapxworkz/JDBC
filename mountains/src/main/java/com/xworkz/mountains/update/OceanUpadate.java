package com.xworkz.mountains.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.mountains.constants.ConnectionData;
import com.xworkz.mountains.dto.OceansDto;

public class OceanUpadate {
	public static void main(String[] args) {
		OceansDto ocean1 = new OceansDto("Pacific Ocean", 10946, "Eastern Hemisphere");	
		ocean1.setDepth(123);
		String query="UPDATE ocean_table set depth=? where name=?";
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(), ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
	    		PreparedStatement preparedStatement=connection.prepareStatement(query);){
	    	preparedStatement.setDouble(1, ocean1.getDepth());
	    	preparedStatement.setString(2, ocean1.getName());
	    	preparedStatement.executeUpdate();
	    	System.out.println("update");
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
	}
	

}
