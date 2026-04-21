package com.training.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class JDBCExample 
{
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "Akshay@123");
			
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
			
			
			ArrayList<Employee> eList = new ArrayList<Employee>();
			
			while(rs.next())
			{
				eList.add(new Employee(rs.getInt("id"), rs.getString("name"), rs.getDouble("salary")));
				System.out.println(rs.getInt("id")+ " "+ rs.getString("name")+ " "+ rs.getDouble("salary"));
			}
			
			eList.forEach(e -> System.out.println(e));
			
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
