package com.xworkz.fruits.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.fruits.constants.ConnectionData;
public class BananaInsert {
    public static void main(String[] args) {
        String query = "INSERT INTO fruits_info(fruit_name, quantity_in_stock, price_per_unit, taste) VALUES (?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(ConnectionData.URL.getValue(),
                ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
             PreparedStatement preparedStatement = connection.prepareStatement(query);) {

        	 preparedStatement.setString(1, "Banana");
             preparedStatement.setInt(2, 150);
             preparedStatement.setDouble(3, 1.20);
             preparedStatement.setString(4, "Sweet");

            preparedStatement.executeUpdate();
            System.out.println("Fruit inserted successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



