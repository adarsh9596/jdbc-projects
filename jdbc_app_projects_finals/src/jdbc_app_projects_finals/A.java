package jdbc_app_projects_finals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class A {

	public static void main(String[] args) {
		
		try {
		
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test_db_1","root","adarsh");
		System.out.println(con);
		
		
		Statement stmnt = con.createStatement();
		
		stmnt.executeUpdate("insert into student values('aman','bareilly','adarsh@gmail.com','8077287694')");
		
		
		con.close();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}
