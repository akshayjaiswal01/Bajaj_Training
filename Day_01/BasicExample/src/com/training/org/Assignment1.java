package com.training.org;

import java.util.Scanner;

public class Assignment1 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter Number: ");
		num = Integer.parseInt(scanner.findInLine("\\d{1,4}"));
		
		String num4 = String.valueOf(num % 10);
		num4 = num4 + 1000;
		num = num / 10;
		
		String num3 = String.valueOf(num % 10);
		num3 = num3 + 100;
		num = num / 10;
		
		String num2 = String.valueOf(num % 10);
		num2 = num2 + 10;
		num = num / 10;
		
		int num1 = num % 10;
		
		
		System.out.println(num1+"000"+ "+" + num2+"00"+ "+" + num3+"0"+ "+" + num4+ "");
	}
}
