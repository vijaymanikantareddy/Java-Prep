package com.flm.servlet;

import java.io.IOException;

import com.flm.dao.ComplaintDao;
import com.flm.model.Complaint;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AfterUpdateStatusServlet")
public class AfterUpdateStatusServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String status = req.getParameter("status");
		int complaintId = Integer.parseInt(req.getParameter("complaintId"));
		ComplaintDao dao = new ComplaintDao();
		Complaint complaint = dao.getComplaintById(complaintId);

		complaint.setStatus(status);

		dao.updateComplaint(complaint);
		resp.sendRedirect("AdminViewServlet");
	}
}
