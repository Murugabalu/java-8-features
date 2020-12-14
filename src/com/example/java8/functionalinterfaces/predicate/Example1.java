package com.example.java8.functionalinterfaces.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

//Check whether the given number is even and >20 Using predicate
public class Example1 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Predicate<Integer> p1 = O -> (O>20) && (O%2==0);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		if(p1.test(num))
			System.out.println("Number is Even and is Greater than 20");
		else
			System.out.println("Number is Not Even or is lesser than 20");
	}

}
