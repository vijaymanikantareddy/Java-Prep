package com.flm.servlet;

import java.io.IOException;

import com.flm.dao.ComplaintDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ResidentViewServlet")
public class ResidentViewServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ComplaintDao complaintDao = new ComplaintDao();

	}

}
