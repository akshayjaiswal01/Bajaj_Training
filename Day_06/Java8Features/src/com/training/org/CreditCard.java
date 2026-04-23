package com.training.org;

public class CreditCard implements Payments
{

	@Override
	public void pay(double number) 
	{
		if(Payments.validateAmount(number))
		{
			System.out.println(number+" has been paid successfully");
		}
		else {
			System.out.println("Invalid amount");
		}
		
		System.out.println("Pay method from creditcard");
		
	}

}
