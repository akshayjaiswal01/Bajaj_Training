package com.training.org;

interface Vehicle
{
	default void start()
	{
		System.out.println("Vehicle is starting");
	}
}


class Car implements Vehicle
{
	
}

public class DefaultMethodInterface 
{
	public static void main(String[] args) {
		Car car = new Car();
		car.start();
	}
}
