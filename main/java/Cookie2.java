
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/square1")
public class Cookie2 extends HttpServlet{
 
	 public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	 {
	
//	 { 
		 int k=0;
		 Cookie cookies[]=req.getCookies();//as many cookies
//		 
		 for(Cookie c:cookies)
		 {
			 if(c.getName().equals("k"))
				 k=Integer.parseInt(c.getValue());
					 

				 
		 }
		 
		 PrintWriter out=res.getWriter();
		
			out.println("res is " + k);
		 
	 }
}