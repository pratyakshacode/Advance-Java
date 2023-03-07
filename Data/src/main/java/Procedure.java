import java.sql.*;

public class Procedure {
	public static void main(String[]args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadatabase", "root", "Pr@1yaksha");
		
		CallableStatement cs = con.prepareCall("{call updateEmpSalary(?,?)}");
		
		cs.setInt(1, 101);
		cs.setDouble(2, 0.1);
		cs.executeUpdate();
		
		con.close();
	}
}
