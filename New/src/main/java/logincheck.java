import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

@WebServlet("/logincheck")
public class logincheck extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	public void doPost (HttpServletRequest req, HttpServletResponse res) throws IOException {
		Connection con = null;
		
		try{
			res.setContentType("text/html");
			
			String email = req.getParameter("email");
			String pass = req.getParameter("pass");
			
			
			System.out.println(email + pass);
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadatabase", "root", "Pr@1yaksha");
			Statement st = con.createStatement();
			
			ResultSet set  = st.executeQuery("SELECT * FROM  registration where email = '" + email + "' and password = '" + pass + "'" );
			
			PrintWriter out = res.getWriter();
			if(set.next()){
				out.print("<h1 color='blue'>Welcome to the website</h1>");
			}
			else out.println("Invalid Details");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			finally {
				try{
					
					con.close();
					
				}catch(Exception e){
					e.printStackTrace();
				}
			}
	}

}
