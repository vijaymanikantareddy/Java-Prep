package com.batch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.util.JdbcUtil;

public class BatchProcessing {
	public static void main(String[] args) throws SQLException {
		JdbcUtil jdbcUtil = new JdbcUtil();
		Connection connection = jdbcUtil.getConnection();

		PreparedStatement statement = connection
				.prepareStatement("Insert into employees(employee_id, email, first_name, last_name) values(?,?,?,?)");

		statement.setInt(1, 32);
		statement.setString(2, "dell@gmail.com");
		statement.setString(3, "Dell");
		statement.setString(4, "lastname");

		statement.addBatch();
		System.out.println("batch added 1");

		statement.setInt(1, 23);
		statement.setString(2, "lenovo@gmail.com");
		statement.setString(3, "Lenovo");
		statement.setString(4, "lastname");

		statement.addBatch();
		System.out.println("batch added 2");

		statement.setInt(1, 233);
		statement.setString(2, "hp@gmail.com");
		statement.setString(3, "HP");
		statement.setString(4, "lastname");

		statement.addBatch();
		System.out.println("batch added 3");
		statement.executeBatch();

	}
}
