<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Admin Dashboard</title>
</head>
<body>
	<h2>
		Hello
		<%=session.getAttribute("username")%>!!! Welcome to Admin Dashboard
	</h2>
	<ul>
		<li><a href="AdminViewServlet">View all Complaints</a></li>
		<li><a href="login.jsp">Logout</a></li>
	</ul>
</body>
</html>
