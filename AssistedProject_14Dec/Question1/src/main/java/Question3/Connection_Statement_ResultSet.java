package Question3;

import java.sql.*;


public class Connection_Statement_ResultSet {

	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Root@211");
		//Statement
		Statement stmt=con.createStatement();
		//ResultSet
		ResultSet rs=stmt.executeQuery("select * from employee");
		while(rs.next()) {
//			System.out.println("id is "+ rs.getInt(1)+" name id "+ rs.getString(2)+" salary is: "+ rs.getFloat(3) );
			System.out.println("id is: "+ rs.getInt("id")+" name is: "+ rs.getString("name")+" salary is: "+ rs.getFloat("salary") );
		}
		
	} catch (Exception e) {
		System.out.println("Error while fetching the record "+e);
	}

	}

	}


