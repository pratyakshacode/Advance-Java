import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/redirectpage")
public class RedirectPage extends HttpServlet{
		
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		res.sendRedirect("index.html");
	}
}
