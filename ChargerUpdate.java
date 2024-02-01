package com.xworkz.charger.update;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.charges.constants.ConnectionData;

public class ChargerUpdate {
		public static void main(String[] args) {
			String query="UPDATE charger_table SET charger_brand=? WHERE charger_id=?";
			try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
					ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
					PreparedStatement preparedStatement=connection.prepareStatement(query);){
				preparedStatement.setString(1, "PowerPulse");
	            preparedStatement.setInt(2, 1);
	           
				preparedStatement.executeUpdate();
				System.out.println("Inserted");

				
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

}



