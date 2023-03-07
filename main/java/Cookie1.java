
import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add1")
public class Cookie1 extends HttpServlet{
	
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
{
//	int i=Integer.parseInt(req.getParameter("num1"));
//	int j=Integer.parseInt(req.getParameter("num2"));
//	int k=i+j;
	//3//
	
	int k = 45;
	
	Cookie cookie=new Cookie("k",k + "");
	res.addCookie(cookie);
	
	//2//
	//HttpSession session=req.getSession();
	//session.setAttribute("k",k);
	//1///
//	res.sendRedirect("square1?k="+k);//url rewriting
	res.sendRedirect("square1");
}
}