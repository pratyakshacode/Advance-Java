import java.sql.*;

public class SelectQuery {
	public static void main(String[]args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadatabase", "root", "Pr@1yaksha");
		
		Statement st = con.createStatement();
		
		ResultSet set = st.executeQuery("SELECT * FROM Employee");
		
		while(set.next()) {
			System.out.println(set.getInt(1) + " " + set.getString(2) + " " + set.getString(3) + " " + set.getInt(4));
		}
	
	}
}
