package com.example.java8.functionalinterfaces.predicate;

import java.util.function.Predicate;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"Aishu", "Aara", "Balu", "Benjamin", "Virat", "Ammu"};
		
		Predicate<String> startsWithA = S -> S.charAt(0)=='A';
		
		System.out.println("Names starting with A");
		for(String name: names) {
			if(startsWithA.test(name))
				System.out.println(name);
		}
		
		System.out.println("Names not starting with A");
		for(String name: names) {
			if(startsWithA.negate().test(name))
				System.out.println(name);
		}

	}

}
