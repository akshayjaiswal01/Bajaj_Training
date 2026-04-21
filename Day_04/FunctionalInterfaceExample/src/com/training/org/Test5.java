package com.training.org;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Test5 
{
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Java");
		map.put(2, "Python");
		
		map.forEach( (key, value) -> 
			System.out.println(key +" -> "+value)
		);
		
		
		
		
		List<String> names = Arrays.asList("Amit", "Rahul", "Ankit", "John");
		
		names.stream()
			.filter(name -> name.startsWith("A"))
			.forEach(System.out::println);
		
		
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		int sum = list.stream()
				.reduce(0, (a, b) -> a + b);
		System.out.println(sum);
		
		
		
		
	}
}
