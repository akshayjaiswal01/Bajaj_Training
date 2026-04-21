package com.training.org;

public class Test 
{
	static <T> void print(T data)
	{
		System.out.println(data);
	}
	
	public static void main(String[] args) 
	{
		print("Hello");
		print(100);
		print(3.14);
	}
}
