package dynamicway;
//Using Prestatement: insert query is executed(same data multipletime)
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Prestmtif {
	public static void main(String[] args) throws Exception {
		
	Class.forName("com.mysql.jdbc.Driver");
		
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		//import Connection-java.mysql

		String sql="Insert into student1 values(?,?,?)";
		PreparedStatement prestmt=con.prepareStatement(sql);
		
		prestmt.setInt(1,11);//column 1
		prestmt.setString(2,"Rutuja");//column 2
		prestmt.setInt(3,22);//column 3
		int i=prestmt.executeUpdate();
		if(i==1)
		{
			System.out.println("Inserted Successfully");
		}
		else
		{
			System.out.println("Invalid Entry");
		}
	}
}
