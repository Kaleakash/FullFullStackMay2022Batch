<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<select name="empName">
<%
Object obj  = session.getAttribute("listOfEmp");

if(obj!=null){
	List<Employee> listOfEmp = (List<Employee>)obj;
	out.println(listOfEmp.size());
	Iterator<Employee> li = listOfEmp.listIterator();
	while(li.hasNext()){
		Employee emp = li.next();
		%>
			<!-- 
			<option><%=emp.getId()+" "+emp.getName()+" "+emp.getSalary() %></option>
			 -->
			 <option value=<%=emp.getName() %>><%=emp.getName() %></option>
		<%
	}
}
%>
</select>
<br>
<h2>Employee Details using scriptlet tag</h2>
<table border="1">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Salary</th>
	</tr>
	
	<%
Object obj1  = session.getAttribute("listOfEmp");
if(obj1!=null){
	List<Employee> listOfEmp1 = (List<Employee>)obj1;
	
	Iterator<Employee> li1 = listOfEmp1.listIterator();
	while(li1.hasNext()){
		Employee emp = li1.next();
		%>
			<tr>
				<td><%=emp.getId() %></td>
				<td><%=emp.getName() %></td>
				<td><%=emp.getSalary() %></td>
			</tr>		
		<%
	}
}
%>
</table>
<h2>Employee Details using jstl tag</h2>
<table border="1">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Salary</th>
	</tr>
	<core:forEach items="${sessionScope.listOfEmp}" var="emp">
	<tr>
    	<td><core:out value="${emp.id}"></core:out>
    	<td><core:out value="${emp.name}"></core:out>
    	<td><core:out value="${emp.salary}"></core:out>
	</tr>
</core:forEach>
</table>
</body>
</html>

