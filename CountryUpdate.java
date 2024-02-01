package com.xworkz.country.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.country.constants.ConnectionData;

public class CountryUpdate {
    public static void main(String[] args) {
		String query="UPDATE country SET country_name=? WHERE country_id=?";
    	try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
				PreparedStatement preparedStatement=connection.prepareStatement(query);){
    		preparedStatement.setString(1, "Canada");
            preparedStatement.setInt(2, 4);
            preparedStatement.executeUpdate();
            System.out.println("updated");
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
	}
}
