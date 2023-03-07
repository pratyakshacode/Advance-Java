<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import='java.sql.*' %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Database</title>
<link rel='stylesheet' href='datastyle.css'>
</head>
<body>
<%

try{
	
	response.setContentType("text/html");
	
	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadatabase", "root", "Pr@1yaksha");
	Statement st = con.createStatement();
	
	ResultSet set  = st.executeQuery("SELECT * FROM EMPLOYEE");
	
	out.println("<table> <tr> <th> Eno </th> <th> Ename </th> <th> EDepartment</th> <th> Esalary </th> </tr>");
	while(set.next()){
		out.println("<tr>"+
							"<td>" + set.getInt(1) + " </td>" +
							"<td>" + set.getString(2) + "</td>" + 
							"<td>" + set.getString(3) +  "</td> "  + 
							"<td> "+ set.getInt(4) + "</td>" + 
					"</tr>");
	}
	
	out.println("/<table>");
} catch(Exception e){
	e.printStackTrace();
}

%>
</body>
</html>