package com.training.org;

public class TestMyStack 
{
	public static void main(String[] args)
	{
		MyStack<Integer> st1 = new MyStack<Integer>();
		st1.push(10);
		st1.push(20);
		st1.push(30);
		st1.push(40);
		st1.push(50);
		
		st1.display();
		
		MyStack<String> st2 = new MyStack<String>();
		st2.push("Akshay");
		st2.push("Atharv");
		st2.push("Ojas");
		st2.push("Yash");
		st2.push("Sumit");
		
		st2.display();
	}
}
