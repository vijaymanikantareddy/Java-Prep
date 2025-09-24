<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result Page</title>
</head>
<body>
	<%
	String name = (String) request.getAttribute("name");
	String password = (String) request.getAttribute("password");
	%>

	<h1>
		Hii
		<%=name%>!!! You are signed up...
	</h1>
	<h2>
		Do not expose your password :
		<%=password%></h2>
</body>
</html>