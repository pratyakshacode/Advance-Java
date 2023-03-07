import java.sql.*;
import java.util.Scanner;

public class UpdateData {
	public static void main(String[]args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadatabase", "root", "Pr@1yaksha");
		
		Statement st = con.createStatement();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the id of employee to change details : ");
		int id = Integer.parseInt(sc.nextLine());
		
		String query = "Update employee set ename = 'Pratyaksha' where eno = " + id;
		
		int row = st.executeUpdate(query);
			
		System.out.println("No. of rows affected : " + row);
		
		if(row > 0) System.out.println("updated");
		else System.out.println("Something went wrong");
	}	
}
