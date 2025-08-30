package com.metadata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.util.JdbcUtil;

public class MetaDataInfo {
	public static void main(String[] args) throws SQLException {
		JdbcUtil jdbcUtil = new JdbcUtil();
		Connection connection = jdbcUtil.getConnection();
		String query = "SELECT * FROM EMPLOYEES";
		PreparedStatement statement = connection.prepareStatement(query);

		ResultSet resultSet = statement.executeQuery();

		ResultSetMetaData metaData = resultSet.getMetaData();

		System.out.println(metaData.getTableName(1));

		System.out.println("Column count: " + metaData.getColumnCount());
		int count = metaData.getColumnCount();
		for (int i = 1; i <= count; i++) {
			System.out.print(metaData.getColumnName(i));
			System.out.print("\t");
		}

		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2));
		}

	}
}
