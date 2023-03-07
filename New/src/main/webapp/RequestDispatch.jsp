<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="jakarta.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
RequestDispatcher rd = request.getRequestDispatcher("index.html");
rd.forward(request, response);

%>

</body>
</html>