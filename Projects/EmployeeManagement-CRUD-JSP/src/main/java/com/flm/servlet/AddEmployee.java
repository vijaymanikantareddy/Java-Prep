package com.flm.servlet;

import java.io.IOException;

import com.flm.dao.EmployeeDao;
import com.flm.model.Employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/addEmployee")
public class AddEmployee extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String email = request.getParameter("email");
		String phoneNumber = request.getParameter("phoneNumber");
		double salary = Double.parseDouble(request.getParameter("salary"));

		Employee emp = new Employee(name, age, email, phoneNumber, salary);
		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.addEmployee(emp);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("employees");
		requestDispatcher.forward(request, response);
	}

}
