package com.training.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCSelect 
{
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "Akshay@123");
			
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
			
			while(rs.next())
			{
				System.out.println(rs.getInt("id")+ " "+ rs.getString("name")+ " "+ rs.getDouble("salary"));
			}
			
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
