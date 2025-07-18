package com.ddl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.util.JdbcUtil;

public class Login {
	public static void main(String[] args) throws SQLException {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter username: ");
//		String username = sc.nextLine();
//		System.out.println("Enter Password: ");
//		String password = sc.nextLine();
//
//		JdbcUtil jdbcUtil = new JdbcUtil();
//		Connection connection = jdbcUtil.getConnection();
//		Statement statement = connection.createStatement();
//
//		String query = "Select * from users where username='" + username + "' and password='" + password + "'";
//
//		ResultSet resultSet = statement.executeQuery(query);
//		if (resultSet.next()) {
//			System.out.println("Login Successful!!!");
//		} else {
//			System.out.println("Invalid Credentials");
//		}

		preparedStatement();
	}

	public static void preparedStatement() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username: ");
		String username = sc.nextLine();
		System.out.println("Enter Password: ");
		String password = sc.nextLine();

		JdbcUtil jdbcUtil = new JdbcUtil();
		Connection connection = jdbcUtil.getConnection();

		String query = "SELECT * FROM users WHERE username = ? and password = ?";
		PreparedStatement statement = connection.prepareStatement(query);

		statement.setString(1, username);
		statement.setString(2, password);

		ResultSet resultSet = statement.executeQuery();
		if (resultSet.next()) {
			System.out.println("Logged in");
		} else {
			System.out.println("Invalid Credentials");
		}
	}
}
