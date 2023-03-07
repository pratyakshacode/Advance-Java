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

String name = request.getParameter("date");
String time = request.getParameter("time");
String data = request.getParameter("data");



out.println("This is the forwarded request page with the values ");
out.println("<h3> "+ name +  " " + time + " " + data + "</h3> <br>");
	
%>

</body>
</html>