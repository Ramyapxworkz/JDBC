package com.xworkz.charger.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;
import com.xworkz.charges.constants.ConnectionData;

public class ChargerSelect {
public static void main(String[] args) {
	String query="SELECT * FROM charger_table WHERE charger_id=?";
	try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(), ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
			PreparedStatement preparedStatement=connection.prepareStatement(query)){
		preparedStatement.setInt(1, 2);
	ResultSet resultset=preparedStatement.executeQuery();
	while(resultset.next()) {
		System.out.println();
	}
	}catch(SQLException e) {
		e.printStackTrace();
	}
}
}
