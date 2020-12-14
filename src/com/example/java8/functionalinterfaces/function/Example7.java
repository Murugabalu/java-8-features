package com.example.java8.functionalinterfaces.function;

import java.util.ArrayList;
import java.util.Arrays;

//Simple implementation of Generic Datatype in Function
public class Example7 {
	
	public static <T> void display(T t) {
		
		System.out.println(t);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(7);
		display(null);
		display("Hello");
		display(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)));
	}

}
