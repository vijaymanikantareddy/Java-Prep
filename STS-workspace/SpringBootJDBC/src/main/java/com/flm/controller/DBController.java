package com.flm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flm.model.Employee;

@RestController
public class DBController {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@GetMapping("/save")
	public String save() {

		jdbcTemplate.update("insert into employees values(?, ?, ?)", 56, "ab56@email.com", 77850);
		return "Saved Data 56";
	}

	@GetMapping("/get")
	public Employee getEmployee() {
		Employee employee = jdbcTemplate.queryForObject("select * from employees where empId=3",
				(rs, n) -> new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
		System.out.println(employee);
		return employee;
	}

	@GetMapping("/hi")
	public String hi() {
		return "Hii Dude";
	}
}
