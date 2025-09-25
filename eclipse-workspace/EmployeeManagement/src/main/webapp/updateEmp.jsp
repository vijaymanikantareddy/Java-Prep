<%@page import="com.flm.model.Employee"%>
<%@page import="com.flm.dao.EmployeeDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>
	<%
	int empId = Integer.parseInt(request.getParameter("id"));
	EmployeeDao employeeDao = new EmployeeDao();
	Employee emp = employeeDao.getEmployee(empId);
	%>

	<h1>Update Employee Details</h1>
	<form action="update" method="post">
		EmpID: <input type="hidden" name="id" value="<%=emp.getEmpId()%>">
		<br> <br> Name: <input type="text" name="name"
			value="<%=emp.getName()%>"> <br> <br> Age: <input
			type="number" name="age" value="<%=emp.getAge()%>"> <br>
		<br>Email: <input type="email" name="email"
			value="<%=emp.getEmail()%>"> <br> <br> Phone
		Number: <input type="number" name="phoneNumber"
			value="<%=emp.getPhoneNum()%>"> <br> <br> Salary: <input
			type="number" name="salary" value="<%=emp.getSalary()%>"> <br>
		<br> <input type="submit" value="Update">
	</form>
</body>
</html>