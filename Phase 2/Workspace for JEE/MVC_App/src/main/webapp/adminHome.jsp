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
String admin = (String)session.getAttribute("admin");
if(admin==null){
	response.sendRedirect("index.jsp");
}else {
	out.println("Welcome to Admin Home Page "+admin);	
}

%>
<br/>
<a href="ProductController">View All Product</a> |
<a href="storeProduct.jsp">Store Product</a>

<br/>
<a href="index.jsp">Logout</a>
</body>
</html>