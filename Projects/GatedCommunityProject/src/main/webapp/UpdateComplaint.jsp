<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.flm.model.Complaint"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Complaint</title>
</head>
<body>
	<%
	Complaint complaint = (Complaint) request.getAttribute("complaint");
	%>
	<form action="UpdatedComplaintServlet" method="post">
		<input type="hidden" name="complaintId"
			value=<%=complaint.getComplaintId()%> /> Category: <input
			type="text" name="category" value=<%=complaint.getCategory()%> /><br />
		<br /> Subject: <input type="text" name="subject"
			value=<%=complaint.getSubject()%> /><br /> <br /> Description:
		<textarea name="description" rows="4" cols="50"><%=complaint.getDescription()%></textarea>
		<br /> <br /> <input type="submit" value="Update" />
	</form>

</body>
</html>