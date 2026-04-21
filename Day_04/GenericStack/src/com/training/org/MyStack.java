package com.training.org;

import java.util.ArrayList;

public class MyStack<T> 
{
	private ArrayList<T> list;

	public MyStack() 
	{
		this.list = new ArrayList<T>();
	}
	
	public void push(T data)
	{
		list.add(data);
		System.out.println((data)+ " pushed to stack");
	}
	
	public T pop()
	{
		if(list.isEmpty())
		{
			System.out.println("Stack is empty");
			return null;
		}
		
		return list.remove(list.size()-1);
	}
	
	public void display()
	{
		if(list.isEmpty())
		{
			System.out.println("Stack is empty");
			return;
		}
		
		System.out.println("Stack: ");
		for(int i = list.size()-1; i>=0; i--)
		{
			System.out.println(list.get(i));
		}
	}
	
	
}
