package com.flm.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.flm.utils.Constants;
import com.flm.utils.DBConnection;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class SignupServlet extends HttpServlet {

	public SignupServlet() {
		super();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirm-password");

		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.INSERT_USER);
			statement.setString(1, email);
			statement.setString(2, password);

			statement.executeUpdate();

			RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
			requestDispatcher.forward(request, response);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
