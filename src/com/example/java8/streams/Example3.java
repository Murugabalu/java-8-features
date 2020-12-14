package com.example.java8.streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(50);
		numbers.add(10);
		numbers.add(60);
		numbers.add(15);
		numbers.add(70);
		
		System.out.println(numbers);
		
		Integer count = (int) numbers.stream().count();
		System.out.println("Count: " + count);
		
		Integer min = numbers.stream().min((num1, num2) -> num1.compareTo(num2)).get();
		System.out.println("Minimum: " + min);
		
		Integer max = numbers.stream().max((num1, num2) -> num1.compareTo(num2)).get();
		System.out.println("Maximum: " + max);
		
		System.out.println("Ascending Order: " + numbers.stream()
							.sorted()
							.collect(Collectors.toList()));

		System.out.println("Descending Order: " + numbers.stream()
							.sorted((num1, num2) -> -num1.compareTo(num2))
							.collect(Collectors.toList()));
		
		
		
	}

}
