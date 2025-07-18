package com.ddl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.util.JdbcUtil;

public class UsersTable {
	public static void main(String[] args) throws SQLException {
		JdbcUtil jdbcUtil = new JdbcUtil();
		Connection connection = jdbcUtil.getConnection();
		Statement statement = connection.createStatement();
		String query = "Create Table users(username varchar(20), password varchar(20))";

		statement.executeUpdate(query);
		System.out.println("Table Created!!!");
	}
}
