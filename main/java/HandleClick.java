import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/click")
public class HandleClick extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		
		out.println("<h1> Hahah This is the magic of Servlet</h1>");
		
	}
}
