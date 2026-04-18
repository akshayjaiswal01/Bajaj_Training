package com.training.org;

import java.util.Scanner;

public class Functions 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		int choice;
		char ch;
		
		do 
		{
			System.out.println("1. Addition \n2. Substraction \n3. Multiplication \n4. Division \n5. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch (choice) 
			{
				case 1 ->
				{
					Functions.addition();
				}
				
				case 2 ->
				{
					System.out.println("Enter first number: ");
					num1 = sc.nextInt();
					
					System.out.println("Enter second number: ");
					num2 =sc.nextInt();
					Functions.substraction(num1, num2);
				}
				
				case 3 ->
				{ 
					System.out.println("Multiplication is "+Functions.multiplication());
				}
				
				case 4 ->
				{
					System.out.println("Enter first number: ");
					num1 = sc.nextInt();
					
					System.out.println("Enter second number: ");
					num2 =sc.nextInt();
					
					System.out.println("Division is: "+Functions.division(num1, num2));
				}
				
				case 5 ->
				{
					System.exit(0);
				}
				
				default ->
				{
					System.out.println("Invalid Input");
				}
			
			}
			System.out.println("Do you want to continue");
			ch = sc.next().charAt(0);
			
		} while (ch=='y' || ch=='Y');
		
		System.out.println("Thank You...");
	}

	private static double division(int num1, int num2) 
	{
		return (double)num1/num2;
	}

	private static int multiplication() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 =scanner.nextInt();
		
		return num1 * num2;
	}

	private static void substraction(int num1, int num2) 
	{
		System.out.println("substraction of "+num1+" and "+num2+" is: "+(num1-num2));
		
	}

	private static void addition() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 =scanner.nextInt();
		
		System.out.println("Addition of "+num1+" and "+num2+" is: "+(num1+num2));
		
	}
}
