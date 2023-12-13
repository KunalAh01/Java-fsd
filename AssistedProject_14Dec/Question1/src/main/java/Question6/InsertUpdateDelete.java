package Question6;
import java.sql.*;
import java.util.Scanner;
public class InsertUpdateDelete {

	public static void main(String[] args) {
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Root@211");
			Scanner sc=new Scanner(System.in);
			//Insert the values
//			PreparedStatement pstmt=con.prepareStatement("insert into employee value(?,?,?)");
//			
//			System.out.println("Enter the id");
//			int id=sc.nextInt();
//			pstmt.setInt(1, id);
//			
//			System.out.println("Enter the name");
//			String name=sc.next();
//			pstmt.setString(2, name);
//			
//			System.out.println("Enter the salary");
//			float salary=sc.nextFloat();
//			pstmt.setFloat(3, salary);
//			
//			int result=pstmt.executeUpdate();
//			if(result>0) {
//				System.out.println("Updated successfully");
//			}
			
//			delete the values
//			PreparedStatement pstmt=con.prepareStatement("delete from employee where id=?");
//			
//			System.out.println("Enter the id");
//			int id=sc.nextInt();
//			pstmt.setInt(1, id);
//			int result=pstmt.executeUpdate();
//			if(result>0) {
//				System.out.println("Updated successfully");
//			}
//			
//			update the values
//			PreparedStatement pstmt=con.prepareStatement("update employee set salary=? where id=?");
//			
//			System.out.println("Enter the id");
//			int id=sc.nextInt();
//			pstmt.setInt(2, id);
//			System.out.println("Enter the salary");
//			float salary=sc.nextFloat();
//			pstmt.setFloat(1, salary);
//			int result=pstmt.executeUpdate();
//			if(result>0) {
//				System.out.println("Updated successfully");
//			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
