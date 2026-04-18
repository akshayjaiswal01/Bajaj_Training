package com.training.org;

public class StaticBlockExample 
{
	static int num;
	static
	{
		num = 100;
		System.out.println("Static block called first before main method");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Main method is called");
		System.out.println("Value of num: "+num);
	}
}
