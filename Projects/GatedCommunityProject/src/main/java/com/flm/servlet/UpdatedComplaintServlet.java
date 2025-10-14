package com.flm.servlet;

import java.io.IOException;

import com.flm.dao.ComplaintDao;
import com.flm.model.Complaint;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/UpdatedComplaintServlet")
public class UpdatedComplaintServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String category = req.getParameter("category");
		String subject = req.getParameter("subject");
		String description = req.getParameter("description");
		int complaintId = Integer.parseInt(req.getParameter("complaintId"));

		ComplaintDao dao = new ComplaintDao();
		Complaint complaint = dao.getComplaintById(complaintId);
		complaint.setCategory(category);
		complaint.setSubject(subject);
		complaint.setDescription(description);

		dao.updateComplaint(complaint);
		resp.sendRedirect("ResidentViewServlet");

	}
}
