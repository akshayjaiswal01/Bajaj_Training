package com.training.org;

interface MyInterface
{
	void sayHello();
	
}

public class Test 
{
	public static void main(String[] args) 
	{
		
		MyInterface obj = () -> System.out.println("Hello Lambda");
		
		obj.sayHello();
	}
}
