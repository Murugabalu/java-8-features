package com.example.java8.functionalinterfaces.supplier;

import java.util.function.Supplier;

//Get a random password of length 8 - Number in odd places and alphabers in even places
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> randomPassword = () -> {
			String password = "";
			String alphabets = "abcdefghijklmnopqrstuvwxyz@$!";
			for(int i=0; i<9; i++) {
				if(i%3==0)
					password = password + (int)(Math.random() * 10);
				else
					password = password + alphabets.charAt((int)(Math.random() * 30));
			}
			return password;
		};
		
		System.out.println(randomPassword.get());
	}

}
