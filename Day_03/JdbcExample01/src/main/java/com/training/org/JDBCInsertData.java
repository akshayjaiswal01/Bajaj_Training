package com.training.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCInsertData 
{
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "Akshay@123");
			
			String query = "INSERT INTO employee(name, salary) VALUES(?, ?)";
			
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, "Akshay");
			ps.setDouble(2, 50000);
			
			int rows = ps.executeUpdate();
			System.out.println(rows+" record inserted");
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
