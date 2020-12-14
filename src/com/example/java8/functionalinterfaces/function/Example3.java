package com.example.java8.functionalinterfaces.function;

import java.util.Scanner;
import java.util.function.Function;

//Remove spaces from a given string
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String input = null;
		
		System.out.println("Enter the input string: ");
		input = sc.nextLine();
		
		Function<String, String> removeSpaces = S -> S.replace(" ","");
		Function<String, Integer> findNumberOfSpaces = S -> {
			return S.length() - removeSpaces.apply(S).length();
		};
		
		System.out.println(removeSpaces.apply(input));
		System.out.println(findNumberOfSpaces.apply(input));
	}

}
