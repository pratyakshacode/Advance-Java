import java.sql.*;

public class ConditionalSelect {
	public static void main(String[]args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/javadatabase";
		String uName = "root";
		String pass = "Pr@1yaksha";
		String query = "SELECT eno, ename, department, sal FROM Employee WHERE department = 'IT'; ";
		
		
		Connection con = DriverManager.getConnection(url, uName, pass);
		
		Statement st = con.createStatement();
		
		ResultSet set = st.executeQuery(query);
		
		
		while(set.next()) {
			System.out.println(set.getInt(1) + " " + set.getString(2) + " " + set.getString(3) + " " + set.getInt(4));
		}
		
		
	}

}
