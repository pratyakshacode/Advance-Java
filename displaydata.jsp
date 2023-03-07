<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2> Your entered details are as follows  </h2>
	<h3> Your favourite color is : <%out.println(request.getParameter("color"));%> </h3>
	<h3> Your favourite food is : <%out.println(request.getParameter("food")); %></h3>
	<h3> Your favourite game is : <%out.println(request.getParameter("game")); %></h3>
	
	<h3 style="color: blue">You are really nice person. Thank You ! </h3>
	
	
	
</body>
</html>