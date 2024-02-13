package com.xworkz.mountains.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.mountains.constants.ConnectionData;
import com.xworkz.mountains.dto.MountainsDto;

public class MountainsRunner {
	public static void main(String[] args) {
		  MountainsDto mountain1 = new MountainsDto("Mount Everest", 8848.86, "Nepal", "Himalayas", 8848);
	        MountainsDto mountain2 = new MountainsDto("K2", 8611, "Pakistan", "Karakoram", 4020);
	        MountainsDto mountain3 = new MountainsDto("Kangchenjunga", 8586, "Nepal", "Himalayas", 3922);
	        MountainsDto mountain4 = new MountainsDto("Lhotse", 8516, "Nepal", "Himalayas", 610);
	        MountainsDto mountain5 = new MountainsDto("Makalu", 8485, "Nepal", "Himalayas", 2386);
	        MountainsDto mountain6 = new MountainsDto("Cho Oyu", 8188, "Nepal", "Himalayas", 2340);
	        MountainsDto mountain7 = new MountainsDto("Dhaulagiri", 8167, "Nepal", "Himalayas", 3357);
	        String query="INSERT INTO mountains_table (name,height,country,ranges,prominence) VALUES (?,?,?,?,?)";
	        try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(), ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
	        		PreparedStatement preparedStatement=connection.prepareStatement(query);){
	        	preparedStatement.setString(1, mountain1.getName());
	        	preparedStatement.setDouble(2, mountain1.getHeight());
	        	preparedStatement.setString(3, mountain1.getCountry());
	        	preparedStatement.setString(4, mountain1.getRange());
	        	preparedStatement.setInt(5, mountain1.getProminence());
	        	preparedStatement.executeUpdate();
	        	preparedStatement.addBatch();
	        	preparedStatement.setString(1, mountain2.getName());
	        	preparedStatement.setDouble(2, mountain2.getHeight());
	        	preparedStatement.setString(3, mountain2.getCountry());
	        	preparedStatement.setString(4, mountain2.getRange());
	        	preparedStatement.setInt(5, mountain2.getProminence());
	        	preparedStatement.executeUpdate();
	        	preparedStatement.addBatch();
	        	preparedStatement.setString(1, mountain3.getName());
	        	preparedStatement.setDouble(2, mountain3.getHeight());
	        	preparedStatement.setString(3, mountain3.getCountry());
	        	preparedStatement.setString(4, mountain3.getRange());
	        	preparedStatement.setInt(5, mountain3.getProminence());
	        	preparedStatement.executeUpdate();
	        	preparedStatement.addBatch();
	        	preparedStatement.setString(1, mountain4.getName());
	        	preparedStatement.setDouble(2, mountain4.getHeight());
	        	preparedStatement.setString(3, mountain4.getCountry());
	        	preparedStatement.setString(4, mountain4.getRange());
	        	preparedStatement.setInt(5, mountain4.getProminence());
	        	preparedStatement.executeUpdate();
	        	preparedStatement.addBatch();
	        	preparedStatement.setString(1, mountain5.getName());
	        	preparedStatement.setDouble(2, mountain5.getHeight());
	        	preparedStatement.setString(3, mountain5.getCountry());
	        	preparedStatement.setString(4, mountain5.getRange());
	        	preparedStatement.setInt(5, mountain5.getProminence());
	        	preparedStatement.executeUpdate();
	        	preparedStatement.addBatch();
	        	preparedStatement.setString(1, mountain6.getName());
	        	preparedStatement.setDouble(2, mountain6.getHeight());
	        	preparedStatement.setString(3, mountain6.getCountry());
	        	preparedStatement.setString(4, mountain6.getRange());
	        	preparedStatement.setInt(5, mountain6.getProminence());
	        	preparedStatement.executeUpdate();
	        	preparedStatement.addBatch();
	        	preparedStatement.setString(1, mountain7.getName());
	        	preparedStatement.setDouble(2, mountain7.getHeight());
	        	preparedStatement.setString(3, mountain7.getCountry());
	        	preparedStatement.setString(4, mountain7.getRange());
	        	preparedStatement.setInt(5, mountain7.getProminence());
	        	preparedStatement.executeUpdate();
	        	preparedStatement.addBatch();
	        	
	        	System.out.println("inserted");
	        }catch(SQLException e) {
	        	e.printStackTrace();
	        }
	}

}
