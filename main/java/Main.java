// import the packages
import java.sql.*;


public class Main{
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		
		// register the class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		String url = "jdbc:mysql://localhost:3306/javadatabase";
		String uName = "root";
		String pass = "root";
		String query = "select * from Student;";
		
		//create connection
		Connection con = DriverManager.getConnection(url, uName, pass);
		
		//create the statement
		Statement st = con.createStatement();
		
		//execute the Query and getting the resultSet
		
		ResultSet set = st.executeQuery(query);
		
		//printing the results
		System.out.println("Id " + " Name " + " Dept");
		while(set.next()) {
			System.out.println(set.getInt(1) + " " + set.getString(2)+ " " + set.getString(3));
		}
		
		con.close();
		
	}
}