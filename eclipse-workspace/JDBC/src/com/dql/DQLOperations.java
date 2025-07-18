package com.dql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.util.JdbcUtil;

public class DQLOperations {
	public static void main(String[] args) {
		try {
			JdbcUtil jdbcUtil = new JdbcUtil();
			Connection connection = jdbcUtil.getConnection();
			Statement statement = connection.createStatement();

			String query = "Select * from employees";
			ResultSet rs = statement.executeQuery(query);

			while (rs.next()) {
				int empId = rs.getInt(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString("last_name");
				System.out.println(empId + " " + firstName + " " + lastName);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
