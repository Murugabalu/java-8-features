package com.example.java8.functionalinterfaces.bi;

import java.util.function.BiPredicate;

public class Example0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<Integer, Integer> sumIsEven = (I1, I2) -> {
			return (I1+I2)%2 == 0;
		};
		
		System.out.println(sumIsEven.test(10, 12));
	}

}
