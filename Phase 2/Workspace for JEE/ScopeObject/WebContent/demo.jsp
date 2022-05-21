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
Object obj1  = session.getAttribute("obj1");
Object obj2 = application.getAttribute("obj2");
out.println("<br/> Value of num is "+obj);
out.println("<br/> Value of num is "+obj1);
out.println("<br/> Value of num is "+obj2);
%>
</body>
</html>