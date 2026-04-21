package com.training.org;

import java.util.Arrays;
import java.util.List;

public class Test4 
{
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		
		list.stream().filter(n -> n%2==0).forEach(n -> System.out.println(n));
		
	}
}
