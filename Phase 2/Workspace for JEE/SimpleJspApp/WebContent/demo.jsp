<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- JSP Comment  --%>
<h1>Welcome to HTML WEb Page</h1>
<%!int a,b,sum; %>
<%
//int a;
//int b;
//int sum = a+b;
a=100;
b=200;
int c=30;
sum = a+b;
System.out.println("Welcome to JSP on console");
out.println("Welcome to JSP on browser <br/>");
out.println("Sum of two number is "+sum);
%>
<%
out.println("Sum of two number is "+sum);
out.println("Value of c is "+c);
%>

<p>Sum of two number is <%=10+40 %></p>
<p>Sum of two number is <%=sum %></p>
<font color=red>The sum of <%=a %> and <%=b %> is <%=sum %></font>

</body>
</html>