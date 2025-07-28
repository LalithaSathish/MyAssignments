package javaDataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLtoJava {
	
	public static void main(String[] args) {
		
		try {
			//Load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Connect to database
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localHost:1521:xe", "hr", "test123");
			//Write Query
			String sql="Select * from employees";
			//prepare the statement
			PreparedStatement prepareStatement=con.prepareStatement(sql);
			//Execute Query
			ResultSet result=prepareStatement.executeQuery();
			//Iterate the result
			while(result.next()) {
				String string=result.getString("EMPLOYEE_ID");
				System.out.print(string);
				
				String string1=result.getString("FIRST_NAME");
				System.out.print("\t"+string1);
				
				String string2=result.getString("SALARY");
				System.out.println("\t"+string2);	
				
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
