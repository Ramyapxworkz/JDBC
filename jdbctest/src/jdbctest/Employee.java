package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.jdbctest.constants.ConnectionDtata;

public class Employee {
	public static void main(String[] args) {
		 // String query="INSERT INTO employee (name,salary,department)VALUES(?,?,?)";
		
		String query="UPADTE employee SET salary=? WHERE department=?";
	       try(Connection connection=DriverManager.getConnection(ConnectionDtata.URL.getValue(), ConnectionDtata.USERNAME.getValue(), ConnectionDtata.PASSWORD.getValue());
	    		   PreparedStatement preparedStatement=connection.prepareStatement(query);){
	//    	   preparedStatement.setString(1, ); 
	    	   preparedStatement.setInt(1, 50000);
	    	   preparedStatement.setString(2, "IT");
//	    	   preparedStatement.executeUpdate();
//	    	   preparedStatement.addBatch();
//	    	   preparedStatement.setString(1, "varu"); 
//	    	   preparedStatement.setInt(2, 50000);
//	    	   preparedStatement.setString(3, "IT");
//	    	   preparedStatement.executeUpdate();
//	    	   preparedStatement.addBatch();
//	    	   preparedStatement.setString(1, "Divya"); 
//	    	   preparedStatement.setInt(2, 25000);
//	    	   preparedStatement.setString(3, "Non IT");
//	    	   preparedStatement.executeUpdate();
	    	   ResultSet resultSet=preparedStatement.executeQuery();
	    	   while(resultSet.next()) {
	    		   System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2));
	    	   }
//	    	   
	    	   System.out.println("Inserted");
	       }catch(SQLException e) {
	    	   e.printStackTrace();
	       }
	}

}
