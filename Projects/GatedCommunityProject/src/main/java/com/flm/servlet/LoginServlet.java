package com.flm.servlet;

import java.io.IOException;

import com.flm.dao.ResidentDao;
import com.flm.model.Resident;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String username = req.getParameter("username");
		String password = req.getParameter("password");

		ResidentDao residentDao = new ResidentDao();

		Resident resident = residentDao.isValid(username, password);
		HttpSession session = req.getSession(true);
		session.setAttribute("residentId", resident.getResidentId());
		session.setAttribute("username", resident.getUsername());
		session.setAttribute("email", resident.getEmail());
		session.setAttribute("phone", resident.getPhone());
		session.setAttribute("role", resident.getRole());

		if (resident != null) {
			if ("admin".equalsIgnoreCase(resident.getRole())) {
				resp.sendRedirect("adminDashboard.jsp");
			} else {
				resp.sendRedirect("residentDashboard.jsp");
			}
		} else {
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}

}
