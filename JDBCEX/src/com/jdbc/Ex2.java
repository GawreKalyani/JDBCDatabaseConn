package com.jdbc;
//Select Query to executed using while loop() (executeQuery(sql));
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex2 {
public static void main(String[] args) throws Exception {
	System.out.println(1);
	//step1:to load Driver Class
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println(2);//select Connection and DriverManager(java.sql)for import
	
	//Step2:To establish connection
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
	System.out.println(3);
	
	//Step3:Create Statement
	Statement stmt=con.createStatement();
	
	//Step4:Write an sql Query
	String sql="Select * from student";
	ResultSet rs=stmt.executeQuery(sql);
		while(rs.next())
		{
			int id=rs.getInt(1);//column 1
			String name=rs.getString(2);//column 2
			int age=rs.getInt(3);//column 3
				System.out.println("Id="+id +" Name="+name +" Age="+age);
		}
}
}
