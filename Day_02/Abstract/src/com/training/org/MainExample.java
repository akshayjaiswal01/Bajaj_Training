package com.training.org;

abstract class BankAccount
{
	protected double balance;
	public BankAccount()
	{
		System.out.println("Default Constructor");
	}
	public void deposit(double amount)
	{
		balance = balance + amount;
		System.out.println("Amount is deposited");
	}
	
	public abstract void withdraw(double amount);
	
	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}
	
	
}

class SavingAccount extends BankAccount
{

	@Override
	public void withdraw(double amount) 
	{
		if(balance < amount)
		{
			System.out.println("Balance is low");
		}
		else {
			balance = balance - amount;
			System.out.println("Amount withdraw from saving account");
		}
		
	}
	
}

class CurrentAccount extends BankAccount
{
	private double overdraftAmount = 500.0;
	@Override
	public void withdraw(double amount) 
	{
		if(balance+overdraftAmount < amount)
		{
			System.out.println("Balance is low");
		}
		else {
			balance = balance - amount;
			System.out.println("Amount withdraw from CurrentAccount");
		}
		
	}
	
}

public class MainExample 
{
	public static void main(String[] args) {
		SavingAccount savingAccount = new SavingAccount();
	}
}
