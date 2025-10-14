<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Raise Complaint</title>
</head>
<body>
	<h2>Submit a new Complaint</h2>
	<form action="RaiseComplaintServlet" method="post">
		Category: <input type="text" name="category" /><br /> <br />
		Subject: <input type="text" name="subject" /><br /> <br />
		Description:
		<textarea name="description" rows="4" cols="50"></textarea>
		<br /> <br /> <input type="submit" value="Submit" />
	</form>
</body>
</html>