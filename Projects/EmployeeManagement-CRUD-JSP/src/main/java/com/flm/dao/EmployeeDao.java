package com.flm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.flm.model.Employee;
import com.flm.utils.Constants;
import com.flm.utils.DBConnection;

public class EmployeeDao {
	public List<Employee> getAllEmployees() {
		Connection connection;
		List<Employee> employees = new ArrayList<>();
		try {
			connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.GET_ALL_EMPLOYEES);
			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
				int empId = resultSet.getInt(1);
				String name = resultSet.getString(2);
				int age = resultSet.getInt(3);
				String email = resultSet.getString(4);
				String phoneNum = resultSet.getString(5);
				double salary = resultSet.getDouble(6);

				Employee emp = new Employee(empId, name, age, email, phoneNum, salary);
				employees.add(emp);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}

	public void addEmployee(Employee employee) {
		Connection connection;
		try {
			connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.INSERT_EMPLOYEE);
			statement.setString(1, employee.getName());
			statement.setInt(2, employee.getAge());
			statement.setString(3, employee.getEmail());
			statement.setString(4, employee.getPhoneNum());
			statement.setDouble(5, employee.getSalary());

			statement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteEmployee(int id) {
		Connection connection;
		try {
			connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.DELETE_EMPLOYEE);
			statement.setInt(1, id);
			statement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public Employee getEmployee(int empId) {
		Connection connection;
		Employee emp = null;
		try {
			connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.GET_EMPLOYEE);
			statement.setInt(1, empId);
			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
				String name = resultSet.getString(2);
				int age = resultSet.getInt(3);
				String email = resultSet.getString(4);
				String phoneNum = resultSet.getString(5);
				double salary = resultSet.getDouble(6);

				emp = new Employee(empId, name, age, email, phoneNum, salary);

			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}

	public void updateEmployee(Employee emp) {
		Connection connection;
		try {
			connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.UPDATE_EMPLOYEE);
			statement.setString(1, emp.getName());
			statement.setInt(2, emp.getAge());
			statement.setString(3, emp.getEmail());
			statement.setString(4, emp.getPhoneNum());
			statement.setDouble(5, emp.getSalary());
			statement.setInt(6, emp.getEmpId());
			statement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
