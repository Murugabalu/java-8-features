package com.example.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Filter Even numbers from an array list
public class Example1 {

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
		
		List<Integer> evenNumbers = numbers.stream().filter(I -> I%2==0).collect(Collectors.toList());
		System.out.println(evenNumbers);
	}

}
