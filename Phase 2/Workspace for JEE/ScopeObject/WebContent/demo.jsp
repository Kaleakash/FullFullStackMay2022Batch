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
out.println("<br/> This is JSP Page");
Object obj	= request.getAttribute("obj");
out.println("<br/> Value of num is "+obj);
%>
</body>
</html>