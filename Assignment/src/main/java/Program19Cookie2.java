import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/loginDetails")
public class Program19Cookie2 extends HttpServlet{
		
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter out;
		
		res.setContentType("text/html");
		
		Cookie [] cookies = req.getCookies();
		out = res.getWriter();
		
		for(var element : cookies) {
			out.println(element.getValue());
		}
		
	}
}
