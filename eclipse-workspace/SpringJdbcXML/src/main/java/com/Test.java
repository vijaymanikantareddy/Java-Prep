package com;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate template = container.getBean("template", JdbcTemplate.class);
//		template.update("insert into employees values(?,?,?) ", 19, "nineteen@gmail.com", 19000);
//		template.update("update employees set email=? where empid=?", "updated@gmail.com", 20);
//		template.update("delete from employees where empid=?", 20);
//		System.out.println("Query executed");

		// RowMapper
		Employee employee = template.queryForObject("Select * from employees where empId=3", new RowMapper<Employee>() {
			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3));
			}
		});
		
		System.out.println(employee);
	}

}
