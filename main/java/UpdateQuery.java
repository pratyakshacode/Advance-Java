import java.sql.*;

public class UpdateQuery {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/javadatabase";
		String uName = "root";
		String pass = "root";
		String query = "insert into student values(1001, 'Raj', 'Mechanical');";
		
		Connection con = DriverManager.getConnection(url, uName, pass);
		Statement st = con.createStatement();
		
		int count = st.executeUpdate(query);
		
		System.out.println("No of rows affected = " + count);
		
		count = st.executeUpdate("delete from student where name = 'Raj'");
		System.out.println("No of deleted rows : " + count);
		
		ResultSet set = st.executeQuery("select * from student");
		
		
		while(set.next()) {
			System.out.println(set.getInt(1) + " " + set.getString(2) + " " + set.getString(3));
		}
		
		con.close();
		
	}
}
