import java.sql.*;
import java.util.Scanner;

public class TransactionControl {
	public static void main(String[]args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/javadatabase";
		String uName = "root";
		String pass = "Pr@1yaksha";
		
		Connection con = DriverManager.getConnection(url, uName, pass);
		con.setAutoCommit(false);
		
		PreparedStatement ps = con.prepareStatement("INSERT INTO DEPARTMENT VALUES(?, ?);");
		
		Scanner sc = new Scanner(System.in);
		

		while(true){
			System.out.println("Enter the department name : ");
			String name = sc.nextLine();
			
			System.out.println("Enter Department id : ");
			int dept_id = Integer.parseInt(sc.nextLine());
			
			ps.setString(1, name);
			ps.setInt(2, dept_id);
			
			ps.executeUpdate();
			
			System.out.println("Do you want to commit/rollback : ");
			String ans = sc.nextLine();
			
			if(ans.equals("commit")) 
				con.commit();
			else 
				con.rollback();
			
			System.out.println("Do you want to add more rows : y/n : ");
			ans = sc.nextLine();
			
			if(ans.equals("n")) break;
			
		}
	con.commit();
	System.out.println("Executed successfully");
		con.close();
	}
}
