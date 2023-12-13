package com;
import java.sql.*;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("Driver loaded successfully");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Root@211");
//			System.out.println("connected successfully");
						
			Scanner sc=new Scanner(System.in);		
//			update the values
			PreparedStatement pstmt=con.prepareStatement("update employee set salary=? where id=?");
			
			System.out.println("Enter the id");
			int id=sc.nextInt();
			pstmt.setInt(2, id);
			System.out.println("Enter the salary");
			float salary=sc.nextFloat();
			pstmt.setFloat(1, salary);
			int result=pstmt.executeUpdate();
			if(result>0) {
				System.out.println("Updated successfully");
			}
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
