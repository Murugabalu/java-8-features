package com.example.java8.functionalinterfaces.predicate;

import java.util.function.Predicate;

public class PredicateExample {
	
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		Predicate<Integer> p = I -> I > 10;
		System.out.println(p.test(100));
		
		Predicate<String> isNull = S -> S==null;
		System.out.println(isNull.test(null));
		System.out.println(isNull.test("Hello World"));
		
		Predicate<Object> isNullOff = O -> O==null;
		System.out.println(isNullOff.test("Hello"));
		System.out.println(isNullOff.test(null));
		System.out.println(isNullOff.test(2));
	}

}
