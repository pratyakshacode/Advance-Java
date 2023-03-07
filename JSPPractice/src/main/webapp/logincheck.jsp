<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import='java.io.*, java.sql.*' %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
	
	
	Connection con = null ;
	
	try{
	response.setContentType("text/html");
	
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String pass = request.getParameter("pass");
	String cPass = request.getParameter("cPass");
	
	
	System.out.println(email + pass);
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadatabase", "root", "Pr@1yaksha");
	Statement st = con.createStatement();
	
	ResultSet set  = st.executeQuery("SELECT * FROM  registration where email = '" + email + "' and password = '" + pass + "'" );
		
	if(set.next()){
		response.sendRedirect("home.jsp");
	}
	else out.println("Invalid Details");
	}
	
	finally {
		try{
			
			con.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	%>
</body>
</html>