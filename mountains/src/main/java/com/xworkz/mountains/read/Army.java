package com.xworkz.mountains.read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.mountains.constants.ConnectionData;

public class Army {
	 public static void main(String[] args) {
		 
		String query="SELECT name,branch FROM army_table where id=?";
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(), ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
	    		PreparedStatement preparedStatement=connection.prepareStatement(query);){
			preparedStatement.setInt(1, 3);
			//preparedStatement.executeUpdate();
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1)+" "+resultSet.getString(2));
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
