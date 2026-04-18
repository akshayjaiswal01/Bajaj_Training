package com.training.org;

import java.util.Scanner;

public class FindMax 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter third number: ");
		int num3 = sc.nextInt();
		
		System.out.println("Enter fourth number: ");
		int num4 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3 && num1 > num4)
		{
			System.out.println("num1 is greater: "+num1);
		}
		else if(num2 > num3 && num2 > num4)
		{
			System.out.println("num2 is greater: "+num2);
		}
		else if (num3 > num4) 
		{
			System.out.println("num3 is greater: "+num3);
		}
		else {
			System.out.println("num4 is greater: "+num4);
		}
	}
}
