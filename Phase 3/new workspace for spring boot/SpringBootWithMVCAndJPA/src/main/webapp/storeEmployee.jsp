<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Add Employee</h2>
	<form action="storeEmloyeeDetails" method="post">
		<label>Id</label>
		<input type="text" name="id"><br/>
		<label>Name</label>
		<input type="text" name="name"><br/>
		<label>Salary</label>
		<input type="text" name="salary"><br/>
		<input type="submit" value="submit"/>
		<input type="reset" value="reset">
	</form>
</body>
</html>