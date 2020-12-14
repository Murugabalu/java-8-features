package com.example.java8.functionalinterfaces.supplier;

import java.util.function.Supplier;

//Get a random 6 digit number using Suplier - Functional Interface
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> randomOTP = () -> {
			String oneTimePass = "";
			for(int i=0; i<6; i++) {
				oneTimePass = oneTimePass + (int)(Math.random() * 10);
			}
			return oneTimePass;
		};
		
		System.out.println(randomOTP.get());
	}

}
