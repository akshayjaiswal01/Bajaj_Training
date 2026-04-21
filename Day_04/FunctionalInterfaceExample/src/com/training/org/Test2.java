package com.training.org;

interface Multiply
{
	int multiply(int a, int b);
}

public class Test2 
{
	public static void main(String[] args) 
	{
		Multiply multiply = (a, b)->{
			int result = a * b;
			return result;
		};
		
		System.out.println(multiply.multiply(10, 5));
	}
}
