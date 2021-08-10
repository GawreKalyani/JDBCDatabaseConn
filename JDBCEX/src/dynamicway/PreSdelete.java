package dynamicway;
//Delete query using Prestatement
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreSdelete {
	public static void main(String[] args) throws Exception {
		
		
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
					//import Connection-java.mysql

			String sql="Delete from student3 where id=?";
			PreparedStatement prestmt=con.prepareStatement(sql);
			
			prestmt.setInt(1,3);//column 1 bcoz of ?
			
			int i=prestmt.executeUpdate();		
			System.out.println("Deleted successfully "+i);
		}
}
