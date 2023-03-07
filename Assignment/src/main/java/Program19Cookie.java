import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/login")
public class Program19Cookie extends HttpServlet {
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		
		Cookie cookie_name = new Cookie("name", name);
		Cookie cookie_pass = new Cookie("pass", pass);
		
		res.addCookie(cookie_name);
		res.addCookie(cookie_pass);
		
		res.sendRedirect("loginDetails");
		
		
	}
}
