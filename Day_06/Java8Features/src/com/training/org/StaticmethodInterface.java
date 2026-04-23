package com.training.org;

interface MathUtils
{
	static int add(int a, int b)
	{
		return a+b;
	}
}

public class StaticmethodInterface {
	public static void main(String[] args) {
		int result = MathUtils.add(10, 20);
		System.out.println(result);
	}
}
