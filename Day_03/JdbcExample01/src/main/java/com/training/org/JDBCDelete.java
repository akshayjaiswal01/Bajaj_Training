package com.training.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCDelete 
{
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "Akshay@123");
			
			String query = "DELETE FROM employee WHERE id=?";
			
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, 3);
			
			int rows = ps.executeUpdate();
			System.out.println(rows+" record deleted");
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
