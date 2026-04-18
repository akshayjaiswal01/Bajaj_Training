package com.training.org;

public class Complex 
{
	private int real;
	private int imag;
	
	
	public Complex() 
	{
		System.out.println("Default constructor of complex class is called");
		real = 0;
		imag = 0;
	}

	public Complex(int real, int imag) 
	{
		System.out.println("Parameterized constructor of complex class is called");
		this.real = real;
		this.imag = imag;
	}
	
	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImag() {
		return imag;
	}

	public void setImag(int imag) {
		this.imag = imag;
	}

	public void showValues()
	{
		System.out.println("Complex values are: "+this.real+" "+this.imag);
	}

	@Override
	public String toString() 
	{
		return "Complex values are: "+this.real+" "+this.imag;
	}
	
	
	
	
	
}
