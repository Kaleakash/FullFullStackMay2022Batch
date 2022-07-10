<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri=""  prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Salary</th>
	</tr>
	<core:forEach items=${requestScope.listOfEmp} var="emp">
			<tr>
				<td><core:out value=${emp.id} ></core:out> </td>
				<td><core:out value=${emp.name} ></core:out> </td>
				<td><core:out value=${emp.salary} ></core:out> </td>
			</tr>
	</core:forEach>
</table>
</body>
</html>