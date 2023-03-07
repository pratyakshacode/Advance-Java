
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/q19")
public class Question19 extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		String user1 = "Pratyaksha";
		String user2 = "Shivam";
		String user3 = "Adarsh";
		String user4 = "Tarun";
		

		Cookie cookie = new Cookie("user1",user1);
		res.addCookie(cookie);
		cookie = new Cookie("user2",user2);
		res.addCookie(cookie);
		cookie = new Cookie("user3",user3);
		res.addCookie(cookie);
		cookie = new Cookie("user4",user4);
		res.addCookie(cookie);
		
		String pwd1 = "pass1";
		String pwd2 = "pass2";
		String pwd3 = "pass3";
		String pwd4 = "pass4";
		
		cookie = new Cookie("pwd1",pwd1);
		res.addCookie(cookie);
		cookie = new Cookie("pwd2",pwd2);
		res.addCookie(cookie);
		cookie = new Cookie("pwd3",pwd3);
		res.addCookie(cookie);
		cookie = new Cookie("pwd4",pwd4);
		res.addCookie(cookie);
		
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		
		PrintWriter out = res.getWriter();
		
		Cookie cookies[] = req.getCookies();
		//out.print(cookies[0].getName());
		//out.print(cookies[4].getName());
		for(int i=0;i<4;i++) {
			if(cookies[i].getValue().equals(name) && cookies[i+4].getValue().equals(pass))
				out.print("Success");
		}
		
	}
}