package com.training.org;

public interface Payments 
{
	void pay(double number);
	
	default void logTransaction(double number)
	{
		System.out.println("Logger value: "+number);
	}
	
	static boolean validateAmount(double number)
	{
		return number > 0 ?true: false;
	}
}