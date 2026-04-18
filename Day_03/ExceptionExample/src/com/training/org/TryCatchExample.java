package com.training.org;

public class TryCatchExample 
{
	public static void main(String[] args) 
	{
		try {
			int a = 10;
			int b = 0;
			int result = a / b;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero ");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Thank you...");
		}
		
		
	}
}
