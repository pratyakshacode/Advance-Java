import java.sql.*;
import java.util.Scanner;

public class Prepared {
	public static void main(String[]args) throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query = "insert into student values(?,?,?);";
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadatabase", "root", "Pr@1yaksha");
		
		PreparedStatement st = con.prepareStatement(query);
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<2; i++) {
			
		System.out.println("Enter the id : ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter the department : ");
		String dept = sc.nextLine();
		
		st.setInt(1, id);
		st.setString(2, name);
		st.setString(3, dept);
		
		st.addBatch();
	}
		
		st.executeBatch();
		
		ResultSet rs = st.executeQuery("select * from Student");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}
		
		sc.close();
		con.close();
	}
	
	
	
}
