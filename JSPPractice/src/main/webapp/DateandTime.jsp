<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page import="java.text.SimpleDateFormat, java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
Date date = new Date();
response.setContentType("text/html");

out.println("<h2> Currently date and time is :  ");
out.println(formatter.format(date));
	


%>
</body>
</html>