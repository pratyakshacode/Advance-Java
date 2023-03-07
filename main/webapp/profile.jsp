<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Sample data</h1>
101 <br>
Pratyaksha <br>
<%
	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javadatabase", "root", "Pr@1yaksha");
	Statement st = con.createStatement();
	
	ResultSet set = st.executeQuery("select * from employee");
	
	while(set.next()){
		out.println(set.getInt(1));
		out.println(set.getString(2));
		out.println(set.getString(3));
		out.println(set.getInt(4));
		
		out.println("\n");
	}
	
	con.close();
%>

</body>
</html>