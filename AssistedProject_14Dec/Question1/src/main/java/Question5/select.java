package Question5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class select {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "Root@211");
			System.out.println("Database selected");

		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
