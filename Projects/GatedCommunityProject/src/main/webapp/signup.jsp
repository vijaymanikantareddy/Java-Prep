<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up Page</title>
</head>
<body>
	<form action="signup" method="post">
		Username: <input type="text" name="username" id="username" /><br />
		<br /> Password: <input type="password" name="password" id="password" /><br />
		<br /> Email: <input type="email" name="email" id="email" /> <br />
		<br /> Phone Number: <input type="text" name="phone" id="phone" /><br />
		<br /> Role: <input type="radio" name="role" value="admin">
		Admin <input type="radio" name="role" value="resident">
		Resident <br /> <br />
		<button>Submit</button>
	</form>
</body>
</html>