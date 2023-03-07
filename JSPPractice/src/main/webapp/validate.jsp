<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
	
	response.setContentType("text/html");
	if(request.getParameter("name").equals("admin") && request.getParameter("pass").equals("admin")) out.println("<h2> Welcome Admin </h2>");
	else out.println("<h2> Invalid User login </h2>");
	
	
	%>
</body>
</html>