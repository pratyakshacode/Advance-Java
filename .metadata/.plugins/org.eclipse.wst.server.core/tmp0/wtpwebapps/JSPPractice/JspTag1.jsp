<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- jsp directives for importing the java library file --> 
    <%@page import="java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%! int val = 34; %>
	
	<!-- using scripting element / scriptlet tag -->
	Entered value in the declarative tag is <% out.println(val); %>
	
	<jsp:forward page="forward.jsp">
            <jsp:param name="date" value="06-09-2019" />
            <jsp:param name="time" value="10:30PM" />
            <jsp:param name="data" value="Hello Jsp" />
        </jsp:forward>
        
       
</body>
</html>