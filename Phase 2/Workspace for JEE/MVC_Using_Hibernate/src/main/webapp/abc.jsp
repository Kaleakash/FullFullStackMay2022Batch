<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name = "Ravi";
session.setAttribute("name", name);
out.println("Name is "+session.getAttribute("name"));
String names[] = {"Ravi","Ramesh","Lokesh","Arjun"};
session.setAttribute("names", names);
%>
<br>

<core:out value="${sessionScope.name}"></core:out>
<br/>
<core:forEach items="${sessionScope.names}" var="n">
	<core:out value="${n}"></core:out>
</core:forEach>
</body>
</html>