package com.training.org;

public class Main
{
	public static void main(String[] args) 
	{
		Employee ftEmployee = new FultimeTimeEmployee("Akshay", 101, 50000);
		Employee interEmployee = new Intern("Ojas", 102, 20, 80);
		
		ftEmployee.displayInfo();
		interEmployee.displayInfo();
	}
}

abstract class Employee 
{
	protected String name;
	protected int id;
	
	public Employee(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public abstract double calculateSalary();
	
	public void displayInfo()
	{
		System.out.println("ID: "+id+", Name: "+ name+", Salary: "+ calculateSalary());
	}
}

class FultimeTimeEmployee extends Employee
{
	private double monthlySalary;
	
	public FultimeTimeEmployee(String name, int id, double monthlySalary) 
	{
		super(name, id);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double calculateSalary() 
	{
		
		return monthlySalary;
	}
	
}

class Intern extends Employee
{
	private double hourlyrate;
	private int hourWorked;
	
	public Intern(String name, int id, double hourlyRate, int hourWorked) 
	{
		super(name, id);
		this.hourlyrate = hourlyRate;
		this.hourWorked = hourWorked;
		
	}

	@Override
	public double calculateSalary() {
		
		return hourlyrate * hourWorked;
	}
	
}


