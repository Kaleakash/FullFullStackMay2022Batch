<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String user = (String)session.getAttribute("user");
if(user==null){
		response.sendRedirect("index.jsp");
}else {
	out.println("Welcome to User Home Page "+user);	
}

%>
<br/>
<a href="ProductController">View All Product</a>
<br/>

<a href="index.jsp">Logout</a>
</body>
</html>