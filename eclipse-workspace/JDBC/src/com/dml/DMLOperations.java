package com.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLOperations {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		System.out.println("Driver Registered");

		// Establish the Connection
		String url = "jdbc:mysql://localhost:3306/mydb";
		String username = "root";
		String password = "root";

		Connection connection = DriverManager.getConnection(url, username, password);

		// Create a Statement
		Statement statement = connection.createStatement();

		// Prepare query
		String query = "INSERT INTO employees (first_name, last_name, email, hire_date, salary) VALUES ('Vijay', 'Reddy', 'vijay.reddy@example.com', '2024-05-01', 892000.00)";

		// Execute the query
		statement.executeUpdate(query);
		
		System.out.println("Data Inserted Successfully!!!");
		
		query = "Update employees set salary=99000 where last_name='Reddy'";
		
		statement.executeUpdate(query);
		System.out.println("Data Updated Successfully!!!");
		
		
		query = "Delete from employees where first_name='eve'";
		statement.executeUpdate(query);
		
		System.out.println("Data Deleted Successfully!!!");
		

	}
}
