package com.flm.servlet;

import java.io.IOException;

import com.flm.dao.UserDao;
import com.flm.model.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirm-password");

		User user = new User(email, password);
		UserDao userDao = new UserDao();

		boolean isValid = userDao.validateUser(user);

		if (isValid) {
			HttpSession session = request.getSession();
			String name = user.getEmail().split("@")[0];
			session.setAttribute("email", name);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("employees");
			requestDispatcher.forward(request, response);
		} else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
			requestDispatcher.forward(request, response);
		}

	}

}
