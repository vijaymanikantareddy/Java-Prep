package com.flm.servlet;

import java.io.IOException;
import java.util.List;

import com.flm.dao.ComplaintDao;
import com.flm.model.Complaint;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/AdminViewServlet")
public class AdminViewServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ComplaintDao complaintDao = new ComplaintDao();
		HttpSession session = req.getSession(true);
		int residentId = (int) session.getAttribute("residentId");
		List<Complaint> list = complaintDao.getAllComplaints();
		req.setAttribute("list", list);
		req.getRequestDispatcher("adminViewComplaint.jsp").forward(req, resp);
	}
}
