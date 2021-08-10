package dynamicway;
//One Data for multiple time using for loop
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Preloop {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		//import Connection-java.mysql

		String sql="Insert into student1 values(?,?,?)";
		PreparedStatement prestmt=con.prepareStatement(sql);
		for(int i=13;i<=18;i++)
		{
			prestmt.setInt(1, i+1);//column 1
			prestmt.setString(2, "Sejal");//column 2
			prestmt.setInt(3,22);//column 3
			prestmt.executeUpdate();
		}
		System.out.println("Inserted successfully");
}
}
