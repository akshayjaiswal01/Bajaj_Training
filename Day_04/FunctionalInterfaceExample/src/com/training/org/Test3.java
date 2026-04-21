package com.training.org;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test3 
{
	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(5, 3, 6, 2, 7);
		
		Collections.sort(list, (a, b)-> a-b);
		
		System.out.println(list);
	}
}
