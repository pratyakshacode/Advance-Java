
import java.io.*;
import jakarta.servlet.annotation.WebServlet;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
@WebServlet("/ServletDB2")
public class JDBC2 extends HttpServlet{

	private static final long serialVersionUID = 1L;
Connection con = null;
Statement stmt = null;
ResultSet rs = null;
public void doGet(HttpServletRequest req, HttpServletResponse res)
throws IOException, ServletException 
{

PrintWriter out = res.getWriter();
res.setContentType("text/html"); 
 		try
		{  
   		Class.forName("com.mysql.jdbc.Driver"); 
		out.println("Driver is Loaded");
   	        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadatabase","root","Pr@1yaksha"); 
		out.println("<br><br>"); 
		out.println( "Connection is Available");
   		stmt=con.createStatement();  
   	        rs=stmt.executeQuery("select * from employee");  
    		out.println("<table border=2 width=50% height=50%>");  
		out.println("<tr><th>EmpId</th><th>EmpName</th><th>EMPADD</th><th>EMPHONE</th><tr>"); 
   			while(rs.next())
			{ 
 			int id = rs.getInt(1);
			String name = rs.getString(2);
			String city = rs.getString(3);
			int mobno = rs.getInt(4);
		out.println("<tr><td>" + id + "</td><td>" + name + "</td><td>" + city + "</td><td>" + mobno + "</td></tr>");   
			 
  			 }  
  
		}
		catch(Exception e){out.println(e);}  
  
 	}
	
  }  