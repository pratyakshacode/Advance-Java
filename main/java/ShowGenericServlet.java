import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/generic")
public class ShowGenericServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		int k = Integer.parseInt(req.getParameter("k"));
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		out.println(" <h2> Entered in url is : " + k + "</h2>");
		
	}
	
}
