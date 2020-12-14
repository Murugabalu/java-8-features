package com.example.java8.functionalinterfaces.function;

import java.util.function.Function;

//Function chaining in Function - Functional Interface
public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> sum = N -> N+N;
		Function<Integer, Integer> cube = N -> {
			return N*N*N;
		};
		
		System.out.println(sum.andThen(cube).apply(2));
		System.out.println(sum.compose(cube).apply(2));
	}

}
