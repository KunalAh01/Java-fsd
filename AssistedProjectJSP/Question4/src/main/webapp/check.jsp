<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!String emailid,password; %>
<%
emailid = request.getParameter("emailid");
password = request.getParameter("password");
if(emailid.equals("kunal@gmail.com") && password.equals("kunal@123")){
	out.println("Successfully login");
	%>
		<jsp:forward page="home.jsp"></jsp:forward>
	<%
}else {
	out.println("failure try once again");
	
			%>
			<jsp:include page="login.jsp"></jsp:include>
			<%
}
response.setContentType("text/html");
%>
</body>
</html>