<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page import="jakarta.servlet.*, java.io.*, java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel='stylesheet' href='contentStyle.css'>
</head>
<body>
	<%
	
	try {
		
		response.setContentType("text/html");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadatabase" , "root", "Pr@1yaksha");
		
		Statement st = con.createStatement();
		
		ResultSet set = st.executeQuery("SELECT * FROM EMPLOYEE");
		
		out.println("<div class='container'>");
		while(set.next()){
		
			out.println(" <div class='employee'>" + 
			"<div class='item cont-eno'>" + set.getInt(1) + "</div>" + 
			"<div class='item cont-ename'> " + set.getString(2) + "</div>" + 
			"<div class='item cont-edept'>" + set.getString(3) + "</div>"+
			"<div class='item cont-esal'>" + set.getInt(4) + "</div>	"+
			"</div>");
			
		}
			out.println("</div>");
	} catch(Exception e){
		e.printStackTrace();
	}
	
	%>
	
	
</body>
</html>