package com.training.org;

import java.util.Scanner;

public class Assignment2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		String [] names = {"Akshay", "Ojas", "Harsh", "nayan", "Bhavesh"};
		
		char ch;
		
		
		do 
		{
			System.out.println("1. Search by first character \n2. Search Particular name \n3. Replace the name \n4. Display Palindrome \n5. Display in Ascending order \n 6. Accept new name in the list \n 7. find the name whose starting letter is not capital and replace with it capital \n 8. find the name whose name is having minimum letter \n9. find the name whose name is haing maximum letter");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch (choice) 
			{
				case 1 ->
				{
					System.out.println("Enter first character: ");
					ch = sc.next().charAt(0);
					
					int flag = 0;
					for(String str : names)
					{
						if(str.charAt(0) == ch)
						{
							System.out.println(str);
							flag = 1;
						}
					}
					
					if(flag == 0)
					{
						System.out.println("name not found");
					}
				}
				
				case 2 ->
				{
					System.out.println("Enter name: ");
					String name = sc.next();
					int flag = 0;
					for(String str : names)
					{
						if(str.equalsIgnoreCase(name))
						{
							System.out.println("name found");
							flag = 1;
						}
					}
					
					if(flag == 0)
					{
						System.out.println("name not found");
					}
				}
				
				case 3 ->
				{
					
				}
				
				case 4 ->
				{
					for(String str : names)
					{
						if(isPalindrome(str))
						{
							System.out.println(str);
						}
					}
				}
				
				case 5 ->
				{
					String [] asc = displayAscending(names);
					
					for(String str : asc)
					{
						System.out.println(str);
					}
				}
				
				
				case 8 ->
				{
					String name = findMinLetter(names);
					System.out.println(name);
				}
				
				case 9 ->
				{
					String name = findMaxLetter(names);
					System.out.println(name);
				}
			
			
			
				default ->
				{
					System.out.println("Invalid Choice");
				}
			
			}
			
			
			System.out.println("Do you want to continue");
			ch = sc.next().charAt(0);
			
		} while (ch=='y' || ch=='Y');
		
		System.out.println("Thank You...");
		
	}

	private static String findMaxLetter(String[] names) 
	{
		String max = names[0];
		
		for(int i=1; i<names.length; i++)
		{
			if(names[i].length() > max.length())
			{
				max = names[i];
			}
		}
		return max;
	}

	private static String findMinLetter(String[] names) 
	{
		String min = names[0];
		
		for(int i=1; i<names.length; i++)
		{
			if(names[i].length() < min.length())
			{
				min = names[i];
			}
		}
		return min;
	}

	private static String[] displayAscending(String[] names) 
	{
		String [] asc = new String[names.length];
		int cnt = 0;
		
		String min = names[0];
		while(cnt < names.length)
		{
			for(int i=1; i<names.length; i++)
			{
				if(names[i].charAt(0) < min.charAt(0))
				{
					min = names[i];
				}
			}
			
			asc[cnt] = min;
			cnt++;
		}
		
		return asc;
	}

	private static boolean isPalindrome(String str) 
	{
		int left = 0;
		int right = str.length()-1;
		
		while(left < right)
		{
			if(str.charAt(left) != str.charAt(right))
			{
				return false;
			}
		}
		return true;
	}
}
