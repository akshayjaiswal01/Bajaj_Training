package com.training.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao 
{
	 public static List<Employee> getAllEmployees() {
	        List<Employee> list = new ArrayList<>();

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            Connection con = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/training", "root", "Akshay@123"
	            );

	            Statement stmt = con.createStatement();
	            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

	            while (rs.next()) {
	                list.add(new Employee(
	                    rs.getInt("id"),
	                    rs.getString("name"),
	                    rs.getString("department"),
	                    rs.getDouble("salary")
	                ));
	            }

	            con.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return list;
	    }
}
