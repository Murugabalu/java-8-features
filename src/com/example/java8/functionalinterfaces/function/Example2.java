package com.example.java8.functionalinterfaces.function;

import java.util.Scanner;
import java.util.function.Function;

//Find square of a number using Function interface
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		
		Function<Integer, Integer> squareFunction = N -> N*N;
		
		System.out.println("Square of given number is: " + squareFunction.apply(num));

	}

}
