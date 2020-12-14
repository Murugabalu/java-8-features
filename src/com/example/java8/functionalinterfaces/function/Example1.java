package com.example.java8.functionalinterfaces.function;

import java.util.Scanner;
import java.util.function.Function;

//Find length of the given string
public class Example1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String word = null;
		
		System.out.println("Enter the string to find length for: ");
		word = sc.nextLine();
		
		Function<String, Integer> findLength = S -> S.length();
		System.out.println(findLength.apply(word));
		
	}

}
