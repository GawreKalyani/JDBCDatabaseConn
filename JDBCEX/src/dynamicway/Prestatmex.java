package dynamicway;
//(select query+delete complete table) using prestatement
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Prestatmex {	//throw declaration-Exception java.lan
	public static void main(String[] args) throws Exception {
		
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
	//import Connection-java.mysql

	String sql="Select * from student1";
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
	PreparedStatement ps1=con.prepareStatement("delete from student1");
	ps1.executeUpdate();
	System.out.println("Record Deleted");//Double Run(To see data is deleted or not)
	}

}
