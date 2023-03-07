<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="jakarta.servlet.*" %>
    <%@page errorPage="error2.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	
	int res = num1 / num2;
	
	out.println("Showing you the result after division : " + res);
	
	out.println("Hey you are using jsp");


%>

</body>
</html>