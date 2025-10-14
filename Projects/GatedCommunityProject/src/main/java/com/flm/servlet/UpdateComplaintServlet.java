package com.flm.servlet;

import java.io.IOException;

import com.flm.dao.ComplaintDao;
import com.flm.model.Complaint;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/UpdateComplaintServlet")
public class UpdateComplaintServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int complaintId = Integer.parseInt(req.getParameter("complaintId"));
		ComplaintDao complaintDao = new ComplaintDao();
		Complaint complaint = complaintDao.getComplaintById(complaintId);
		System.out.println("Complaint ID from request: " + complaintId);
		System.out.println("Complaint from DAO: " + complaint);

		req.setAttribute("complaint", complaint);
		req.getRequestDispatcher("UpdateComplaint.jsp").forward(req, resp);

	}
}
