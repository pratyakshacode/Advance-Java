import java.sql.*;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
			
		String url = "jdbc:mysql://localhost:3306/javadatabase";
		String uName = "root";
		String pass = "root";
		
		Connection con = DriverManager.getConnection(url, uName, pass);
		
		Statement st = con.createStatement();
		
		st.executeUpdate("CREATE TABLE EMPLOYEE ( eno int, ename varchar(30), department varchar(30), sal int );");
	
		
		PreparedStatement ps = con.prepareStatement("INSERT INTO Employee VALUES(?, ?, ?, ?);");
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<1; i++) {
			
			System.out.print("Enter the eno : ");
			int id = Integer.parseInt(sc.nextLine());
					
			System.out.print("Enter the ename : ");
			String ename = sc.nextLine();
			
			System.out.print("Enter the dept : ");
			String dept = sc.nextLine();
			
			System.out.print("Enter the sal : ");
			int dept_id = Integer.parseInt(sc.nextLine());
			
			ps.setInt(1, id);
			ps.setString(2, ename);
			ps.setString(3, dept);
			ps.setInt(4, dept_id);
			
			ps.addBatch();
		}
		
		ps.executeBatch();
		
		ResultSet set = st.executeQuery("SELECT * FROM Employee;");
		
		while(set.next()) {
			System.out.println(set.getString(1) + " " + set.getInt(2));
		}
		
		sc.close();
		
	}
	
}