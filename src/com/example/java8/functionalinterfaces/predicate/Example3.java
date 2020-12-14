package com.example.java8.functionalinterfaces.predicate;

import java.util.function.Predicate;

//Ignore invalid names from Array of Strings
public class Example3 {
	
	public static void main(String[] args) {
		
		String[] names = {"Aishu", "", null, "Aara", "Virat", "king", null};
		
		Predicate<String> isValidString = S -> S!=null && S.length()!=0;
		
		System.out.println("Valid names are...");
		
		for(String name: names) {
			if(isValidString.test(name))
				System.out.println(name);
		}
		
	}

}
