import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/show")
public class ShowServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		String mobile = req.getParameter("mobile");
		
		
		PrintWriter out = res.getWriter();
			out.println("<h2> Details Entered are as follows : </h2>");
			out.println("Your name is : " + name);
			out.println("Your password is : " + pass);
			out.println("Your mobile number is : " + mobile);
	}

}
