<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@page import = "java.io.*" %>
 <%@include file="header.jsp" %>
 <%@page errorPage="error.jsp" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- scriptlet tag  for all java coding--> 

<%! int val = 12; %>
<%
	// i = Integer.parseInt(request.getParameter("num1"));
	//int j = Integer.parseInt(request.getParameter("num2"));
	//int k = i + j;
	
	//out.println("Sum is : " + k);
	
	int i = 9 / 0;  //for the error.jsp
	
%>
</body>
</html>