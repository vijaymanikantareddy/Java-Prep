<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>Hi! Welcome ${name}!!!</h1>
	<form action="signup" method="post">
		Email : <input type="text" name="email"><br> <br>
		Password: <input type="password" name="password"> <br>
		<br>
		<input type="submit" value="Submit">
	</form>

</body>
</html>