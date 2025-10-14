<%@page import="com.flm.model.Complaint"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.*, java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin View Complaint</title>
</head>
<body>
<h2>
		Hello
		<%=session.getAttribute("username")%></h2>
	<h2>All the Complaints are:</h2>
	<%
	List<Complaint> list = (List<Complaint>) request.getAttribute("list");
	%>
	<table border="1">
		<tr>
			<th>Complaint ID</th>
			<th>User ID</th>
			<th>Category</th>
			<th>Subject</th>
			<th>Description</th>
			<th>Status</th>
			<th>Update</th>
		</tr>

		<%
		for (Complaint complaint : list) {
		%>

		<tr>
			<td><%=complaint.getComplaintId()%></td>
			<td><%=complaint.getUserId()%></td>
			<td><%=complaint.getCategory()%></td>
			<td><%=complaint.getSubject()%></td>
			<td><%=complaint.getDescription()%></td>
			<td><%=complaint.getStatus()%></td>
			<td><a
				href="UpdateStatusServlet?complaintId=<%=complaint.getComplaintId()%>">Edit</a></td>
				
			
		</tr>
		<%
		}
		%>

	</table>
	<%

	%>
</body>
</html>