package com.training.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCUpdate 
{
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "Akshay@123");
			
			String query = "UPDATE employee SET salary=? WHERE id=?";
			
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setDouble(1, 40000);
			ps.setInt(2, 2);
			
			int rows = ps.executeUpdate();
			System.out.println(rows+" record updated");
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
