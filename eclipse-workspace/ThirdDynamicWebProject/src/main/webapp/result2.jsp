<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result 2</title>
</head>
<body>
	<h1>
		Name:
		<%=application.getAttribute("name")%></h1>
	<h1>
		Password:
		<%=session.getAttribute("password")%></h1>
</body>
</html>