/**
 * 
 */
package com.example.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Convert all numbers into Multiple of 5

public class Example2 {

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
		
		List<Integer> multiplesOfFive = numbers.stream().map(I->I*5).collect(Collectors.toList());
		System.out.println(multiplesOfFive);
	}

}
