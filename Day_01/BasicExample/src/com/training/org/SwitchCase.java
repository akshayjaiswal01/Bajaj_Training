package com.training.org;

import java.util.Scanner;

public class SwitchCase 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		char ch;
		
		do 
		{
			System.out.println("Enter the month");
			String month = scanner.next();
			
			switch (month) 
			{
				case "Janaury", "March", "May", "July", "August", "Octember", "December" ->
				{
					System.out.println("31 days");
				}
				
				case "Febraury"  ->
				{
					System.out.println("28 days");
				}
				 
				case "April", "June", "September", "November" ->
				{
					System.out.println("30 days");
				}
				
				default ->
				{
					System.out.println("Invalid input");
				}
			
			}
			
			System.out.println("Do you want to continue");
			ch = scanner.next().charAt(0);
			
		} while (ch=='y' || ch=='Y');
		
		System.out.println("Thank You...");
	}
}
