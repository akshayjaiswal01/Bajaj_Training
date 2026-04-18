package com.training.org;

class StaticCounterExample 
{
	private static int counter = 0;
	private String name;
	private int age;
	
	public StaticCounterExample()
	{
		counter++;
		name = "Akshay";
		age = 22;
	}
	
	public static void count()
	{
		System.out.println("Counter: "+counter);
	}
}

public class StaticCounter
{
	public static void main(String[] args) 
	{
		StaticCounterExample c1 = new StaticCounterExample();
		StaticCounterExample c2 = new StaticCounterExample();
		StaticCounterExample c3 = new StaticCounterExample();
		StaticCounterExample c4 = new StaticCounterExample();
		StaticCounterExample c5 = new StaticCounterExample();
		
		StaticCounterExample.count();
	}
}
