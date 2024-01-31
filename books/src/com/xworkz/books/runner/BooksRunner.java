package com.xworkz.books.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.books.constants.ConstantData;

public class BooksRunner {
	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(ConstantData.URL.getValue(),
				ConstantData.USERNAME.getValue(), ConstantData.PASSWORD.getValue());
				Statement statement = connection.createStatement()) {
			String query = "UPDATE book_details SET book_authorname='Shivaram Karanth' where book_authorname='Dr. Ashvini Kumar Dwivedi'";
			int rs = statement.executeUpdate(query);
			if (rs == 1) {
				System.out.println("updated");
			} else {
				System.out.println("Not updated");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
