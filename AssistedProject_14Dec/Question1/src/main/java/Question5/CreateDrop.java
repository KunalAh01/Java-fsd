package Question5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateDrop {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "Root@211");
			Statement stmt=con.createStatement();
			
//			create a database
//			String createDatabase="create Database students";
//			stmt.executeUpdate(createDatabase);
//			System.out.println("Database created ...");
			
			
			//Drop 		
		int result=	stmt.executeUpdate("Drop database students");
		System.out.println("Database deleted successfully");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
