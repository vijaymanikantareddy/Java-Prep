<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resident Dashboard</title>
</head>
<body>

	<h2>
		Hello
		<%=session.getAttribute("username")%>!!! Welcome to Resident Dashboard
	</h2>
	<ul>
		<li><a href="raiseComplaint.jsp">Raise Complaint</a></li>
		<li><a href="ResidentViewServlet">View my Complaints</a></li>
		<li><a href="">Update/Cancel</a></li>
		<li><a href="">Solved Complaints</a></li>
		<li><a href="">Logout</a></li>
	</ul>
</body>
</html>