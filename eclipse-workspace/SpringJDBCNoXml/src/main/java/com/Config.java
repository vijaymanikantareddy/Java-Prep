package com;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config {
	@Bean("template")
	public JdbcTemplate getJdbcTemplate() {
		DataSource dataSource = getDataSource();
		return new JdbcTemplate(dataSource);
	}

	@Bean("dmds")
	public DataSource getDataSource() {
		return new DriverManagerDataSource("jdbc:mysql://localhost:3306/mydb", "root", "root");
	}
}
