package com.example.java8.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Example5 {

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
		
		Integer[] evenNumbers = numbers.stream().filter(i->i%2==0).toArray(Integer[]::new);
		Stream<Integer> s = Stream.of(evenNumbers);
		s.forEach(System.out::println);
		
		Integer[] nums = numbers.stream().toArray(Integer[]::new);
		s = Stream.of(nums);
		s.forEach(System.out::println);	}

}
