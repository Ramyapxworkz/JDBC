package com.xworkz.books.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.books.constants.ConstantBooks;

public class Books {
	public static void main(String[] args) {
		try(Connection connection=DriverManager.getConnection(ConstantBooks.URL.getValue(),
				ConstantBooks.USERNAME.getValue(), ConstantBooks.PASSWORD.getValue());
				Statement statement=connection.createStatement()){
			System.out.println("class is connected");
			String query="INSERT INTO book_details values('The Last Heroes','Palagummi Sainath (P Sainath)')";
			statement.execute(query);
			int rs=statement.executeUpdate(query);
			System.out.println(rs);
			
		}
		catch(SQLException e) {
			System.out.println("class is  not connected");
		e.printStackTrace();
	}

}
}
