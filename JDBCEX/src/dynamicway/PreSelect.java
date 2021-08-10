package dynamicway;
//using Prestatement:select query executed
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreSelect {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		//import Connection-java.mysql

		String sql="Select * from student";
		PreparedStatement prestmt=con.prepareStatement(sql);
		//import 'PreparedStatement'(java.sql)
		
		ResultSet rs=prestmt.executeQuery(sql);
		while(rs.next())
		{
			int id=rs.getInt(1);//column 1
			String name=rs.getString(2);//column 2
			int age=rs.getInt(3);//column 3
				System.out.println("Id="+id +" Name="+name +" Age="+age);
		}
	}
}
