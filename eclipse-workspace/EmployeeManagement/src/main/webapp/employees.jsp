<%@ page import="java.util.*, com.flm.model.*" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Employees</title>
</head>
<body>
	<h3>
		Welcome
		<%=session.getAttribute("email")%></h3>
	<a href="addEmployee.jsp">Add New Employee</a>
	<br>
	<br>
	<table border="1">
		<tr>
			<th>Employee ID</th>
			<th>Name</th>
			<th>Age</th>
			<th>Email</th>
			<th>Phone Number</th>
			<th>Salary</th>
			<th>Delete Employee</th>
			<th>Update Employee</th>
		</tr>
		<%
		List<Employee> empList = (List<Employee>) request.getAttribute("empList");
		for (Employee emp : empList) {
		%>

		<tr>
			<td><%=emp.getEmpId()%></td>
			<td><%=emp.getName()%></td>
			<td><%=emp.getAge()%></td>
			<td><%=emp.getEmail()%></td>
			<td><%=emp.getPhoneNum()%></td>
			<td><%=emp.getSalary()%></td>
			<td><a href="delete?id=<%=emp.getEmpId() %>">Delete</a></td>
			<td><a href="updateEmp.jsp?id=<%=emp.getEmpId() %>">Update</a></td>
		</tr>
		<%
		}
		%>

	</table>
</body>
</html>
