package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
	public Connection connection = null;

	public Connection getConnection() throws SQLException {

		if (connection == null) {
			connection = DriverManager.getConnection(Constants.url, Constants.username, Constants.password);
		}

		return connection;
	}
}
