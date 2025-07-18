package com.ddl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.util.JdbcUtil;

public class SignUp {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username: ");
		String username = sc.nextLine();
		System.out.println("Enter Password: ");
		String password = sc.nextLine();

		JdbcUtil jdbcUtil = new JdbcUtil();
		Connection connection = jdbcUtil.getConnection();
		Statement statement = connection.createStatement();

		String query = "INSERT INTO users values('" + username + "','" + password + "')";

		statement.executeUpdate(query);

		System.out.println("Insertion Done!!!");

	}
}
