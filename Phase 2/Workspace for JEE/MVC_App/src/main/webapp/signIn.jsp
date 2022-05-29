<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Login Page</h2>
<form action="LoginController" method="get">
	<label>Email</label>
	<input type="email" name="email"/><br/>
	<label>Password</label>
	<input type="password" name="password"/><br/>
	<label>TypeOfUser</label>
	<input type="radio" name="typeOfUser" value="Admin">Admin
	<input type="radio" name="typeOfUser" value="User">User
											<br/>
	<input type="submit" value="SignIn"/>
	<input type="reset" value="reset"/>
</form>
<br/>
<a href="signUp.jsp">SignUp!</a>
</body>
</html>