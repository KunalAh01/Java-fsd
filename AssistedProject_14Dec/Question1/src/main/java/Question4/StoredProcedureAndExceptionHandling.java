package Question4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StoredProcedureAndExceptionHandling {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Root@211");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("call simple()");
			while(rs.next()) {
				System.out.println("name is: "+ rs.getString("name") );
			}
			
		} catch (Exception e) {
			System.out.println("Error while fetching the record "+e);
		}

		}

	}


