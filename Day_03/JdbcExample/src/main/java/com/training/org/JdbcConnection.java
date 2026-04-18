package com.training.org;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnection 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dac1", "root", "Akshay@123");
			
			System.out.println("Connection successful");
			connection.close();
		} catch (Exception e) {
			System.out.println("Error "+e.getMessage());
		}
	}
}
