package com.training.org;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Scanner;

import javax.swing.JOptionPane;

public class WelcomeMessage 
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
//		int num = 100;
//		String uName = "Akshay";
//		
//		System.out.println("Welcome to Java Programming");
//		System.out.format("Num %d \n", num);
//		System.err.println("Error!!");
//		System.out.format("User Name %s, Num %d", uName, num);
		
		int empId;
		String empName;
		double salary;
		
		
//      1st way to take input
//		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//		
//		System.out.println("Enter empId");
//		empId = Integer.parseInt(input.readLine());
//		
//		System.out.println("Enter empName");
//		empName = input.readLine();
//		
//		System.out.println("Enter salary");
//		salary = Double.parseDouble(input.readLine());
//		
//		System.out.println("Employee Details are "+"\nempId: "+ empId + "\nempName: "+ empName + "\nsalary: "+ salary);
		
		
//		2nd way to take input
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Enter empId: ");
//		empId = scanner.nextInt();
//		
//		System.out.println("Enter empName: ");
//		empName = scanner.next();
//		
//		System.out.println("Enter salary: ");
//		salary = scanner.nextDouble();
//		
//		System.out.println("Employee Details are: "+"\nempId: "+empId+ "\nempName: "+empName+ "\nsalary: "+salary);
		
		
		empId = Integer.parseInt(JOptionPane.showInputDialog("Enter empId: "));
		empName = JOptionPane.showInputDialog("Enter empName: ");
		salary = Double.parseDouble(JOptionPane.showInputDialog("Enter salary: "));
		
		JOptionPane.showMessageDialog(null, "Employee Details are: "+"\nempId: "+empId+ "\nempName: "+empName+"\nsalary: "+salary);
		
		//JOptionPane.showInternalMessageDialog(null, "Employee Details are: "+"\nempId: "+empId+ "\nempName: "+empName+"\nsalary: "+salary);
		
		
		
		
		
	}
}
