package com.xworkz.mountains.read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.mountains.constants.ConnectionData;

public class ArmyRead {
	public static void main(String[] args) {
		
	  String query="SELECT * FROM army_table";
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(), ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
	    		PreparedStatement preparedStatement=connection.prepareStatement(query);){
			
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getInt(4)+" "+resultSet.getString(5));
				//System.out.println("result");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
