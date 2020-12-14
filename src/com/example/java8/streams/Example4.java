package com.example.java8.streams;

import java.util.ArrayList;

//Foreach in stream
public class Example4 {

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
		
		numbers.stream().forEach(System.out::println);
		numbers.stream().forEach(I->System.out.println(I));
	}

}
