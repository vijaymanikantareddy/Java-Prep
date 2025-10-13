package com.flm.servlet;

import java.io.IOException;

import com.flm.dao.ResidentDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String role = req.getParameter("role");

		ResidentDao residentDao = new ResidentDao();
		boolean validation = residentDao.isValid(username, password);

		if (validation == true) {
			if ("admin".equalsIgnoreCase(role)) {
				resp.sendRedirect("adminDashboard.jsp");
			} else {
				resp.sendRedirect("residentDashboard.jsp");
			}
		} else {
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}

}
