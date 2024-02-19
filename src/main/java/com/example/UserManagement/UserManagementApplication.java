package com.example.UserManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class UserManagementApplication {

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/usermgmt", "root", "root")) {
			if (connection.isValid(5)) { // Check if the connection is valid for 5 seconds
				System.out.println("Connection is established.");
			} else {
				System.out.println("Connection is not valid.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		SpringApplication.run(UserManagementApplication.class, args);
	}

}
