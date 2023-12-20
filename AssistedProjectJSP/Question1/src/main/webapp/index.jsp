<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome to Simple JSP Project</h2>
	<%!
	int a,b,sum;%>
	<%
	a=10;
	b=20;
	sum=a+b;
	out.println("Welcome to JSP<br/>");
	out.println("Sum of two numbers "+sum);
	%>
</body>
</html>