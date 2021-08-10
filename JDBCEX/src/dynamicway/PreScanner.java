package dynamicway;
//Insert data (insert query) by user
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreScanner {
	 public static void main(String[] args) throws Exception {
		
 @SuppressWarnings("resource")
Scanner sc=new Scanner(System.in); 
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			//import Connection-java.mysql

	String sql="Insert into student3 values(?,?,?)";
	PreparedStatement prestmt=con.prepareStatement(sql);
			for(int i=1;i<4;i++)
			{
				prestmt.setInt(1, i);//column 1
				System.out.println("Enter a name");
				prestmt.setString(2,sc.next());//column 2
				System.out.println("Enter age");
				prestmt.setInt(3,sc.nextInt());//column 3
				prestmt.executeUpdate();
			}
			System.out.println("Inserted successfully");
}
}
