package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.xworkz.jdbctest.constants.ConnectionDtata;

public class Jdbc {
	public static void main(String[] args) throws Exception{
	       String query="select product_name,price from product where price=?";
	       try(Connection connection=DriverManager.getConnection(ConnectionDtata.URL.getValue(), ConnectionDtata.USERNAME.getValue(), ConnectionDtata.PASSWORD.getValue());
	    		   PreparedStatement preparedStatement=connection.prepareStatement(query);){
	    	   preparedStatement.setInt(1, 100); 
	    	   ResultSet resultSet=preparedStatement.executeQuery();
	    	   while(resultSet.next()) {
	    		   System.out.println(resultSet.getString(1)+" "+resultSet.getInt(2));
	    	   }
//	    	   int resultSet=preparedStatement.executeUpdate();
	    	   
	    	   System.out.println("Inserted");
	    	  
	       }catch(SQLException e) {
	    	   e.printStackTrace();
	       }
	}

}
