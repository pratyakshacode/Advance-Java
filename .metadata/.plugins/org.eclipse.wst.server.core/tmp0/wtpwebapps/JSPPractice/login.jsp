<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import='java.sql.*, java.io.*' %>
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
	
	
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadatabase", "root", "Pr@1yaksha");
	Statement st = con.createStatement();
	
	int row = st.executeUpdate("INSERT INTO REGISTRATION VALUES("+ "'" + name + "','" + email + "','" + pass + "');");
	
	if(row > 0) {
		response.sendRedirect("loginPage.jsp");
	}
	else {
		out.println("alert('Something went wrong')");
	}
	
	} catch(Exception e){
		e.printStackTrace();
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