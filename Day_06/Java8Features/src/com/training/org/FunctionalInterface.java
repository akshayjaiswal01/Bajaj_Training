package com.training.org;

interface CustomFilter
{
	boolean apply(String name);
}

public class FunctionalInterface 
{
	public static void main(String[] args) 
	{
		CustomFilter customFilter = name -> name.startsWith("A");
		
		System.out.println(customFilter.apply("Akshay"));
	}
}
