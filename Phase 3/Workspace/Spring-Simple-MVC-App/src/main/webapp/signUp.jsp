<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="styles.css" type="text/css"/>
<style type="text/css">
h2{color:blue}
</style>
</head>
<body>
<h2>Account Create</h2>
<form action="signUp" method="post">
	<label>Email</label>
	<input type="email" name="email"><br/>
	<label>Password</label>
	<input type="password" name="password"><br/>
	<input type="submit" value="SignUp"/>
	<input type="reset" value="reset"/>
</form>
</body>
</html>