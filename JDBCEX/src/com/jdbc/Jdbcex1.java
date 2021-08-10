package com.jdbc;
//Insert query executed(stmt.executeUpdate(sql))BY STATIC WAY--DatabaseNm:test TableNm=student
//Username & Password=root,Portno:3306
//any one query executes at a time(Make Comment to other) then run
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//JDBCEX project-Rightclick mouse-Build path-Configue path-libraries-Add External jar
//E/Softwares/Mysql Setup and Documentation/Mysql Setup and Documentation/Mysql_Setup/mysql.jar
//Select mysql.jar file --open--apply(Now Below JRE SYSTEM Library--Referenced libry-mysql.jar present
public class Jdbcex1 {
	public static void main(String args[]) throws  Exception{
		
	System.out.println(1);
	//step1:to load Driver Class
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println(2);//select Connection and DriverManager(java.sql)for import
	
	//Step2:To establish connection
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
	System.out.println(3);
	
	//Step3:Create Statement      //Statement Error:throw Exception-java .lan
	Statement stmt=con.createStatement();
	
	//Step4:Write an sql Query
	String sql="Insert into student values(2,'Kameshwari',32)";
	int a=stmt.executeUpdate(sql);//for update,delete,insert
	System.out.println(a);
		/*String sql1="delete from student where id=2";
		int b=stmt.executeUpdate(sql1);//for update,delete,insert
		System.out.println(b);*/
	}
}
