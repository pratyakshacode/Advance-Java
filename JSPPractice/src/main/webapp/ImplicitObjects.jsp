<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.io.*, jakarta.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	
	//response implicit object 
	
	response.setContentType("text/html");

	//request implicit object for setting up request 
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	String range = request.getParameter("range");
	
	//PrintWriter implicit object out
	
	out.println("<h2> Your name is : " + name + "</h2>"
			+ "<br> <h2> Your age is : "+ age + "<br>" + 
			"<h2> Your given rating is  : " + range
			);
	
	
	
	
	
	


%>
</body>
</html>