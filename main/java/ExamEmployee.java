import java.sql.*;
import java.util.Scanner;


public class ExamEmployee {
	public static void main(String[]args) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadatabase", "root", "Pr@1yaksha");
		
		PreparedStatement st = con.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?);");
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			
			System.out.print("Enter the eno : ");
			int id = Integer.parseInt(sc.nextLine());
					
			System.out.print("Enter the ename : ");
			String ename = sc.nextLine();
			
			System.out.print("Enter the dept : ");
			String dept = sc.nextLine();
			
			System.out.print("Enter the sal : ");
			int dept_id = Integer.parseInt(sc.nextLine());
			
			st.setInt(1, id);
			st.setString(2, ename);
			st.setString(3, dept);
			st.setInt(4, dept_id);
			
			st.addBatch();
		}
		
		st.executeBatch();
		
		Statement stmt = con.createStatement();
		
		stmt.executeUpdate("UPDATE EMPLOYEE SET ename = 'employee2' where ename = 'emp' ");
		
		ResultSet set = stmt.executeQuery("SELECT * FROM EMPLOYEE WHERE ename = 'employee2'");
		
		while(set.next()) {
			
			System.out.println(set.getInt(1) + " " + set.getString(2) + " " + set.getString(3) + " " + set.getInt(4));
		}
		
		con.close();
		sc.close();
		
	}
}
