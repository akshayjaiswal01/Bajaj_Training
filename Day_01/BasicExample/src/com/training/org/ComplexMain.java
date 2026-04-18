package com.training.org;

import java.util.ArrayList;

public class ComplexMain 
{
	public static void main(String[] args) {
		Complex c1 = new Complex();
		System.out.println(c1);
		//c1.showValues();
		
		Complex c2 = new Complex(10, 20);
		System.out.println(c2);
		//c2.showValues();
		
		ArrayList<Complex> arrayList = new ArrayList<Complex>();
		
		arrayList.add(new Complex(50, 60));
		arrayList.add(new Complex(20, 30));
		arrayList.add(new Complex(70, 80));
		arrayList.add(new Complex(30, 80));
		arrayList.add(new Complex(40, 80));
		
		for(Complex complex : arrayList)
		{
			System.out.println(complex);
			//complex.showValues();
		}
	}
}
