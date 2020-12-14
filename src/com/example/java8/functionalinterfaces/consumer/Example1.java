package com.example.java8.functionalinterfaces.consumer;

import java.util.function.Consumer;

//Program to demo Consumer - Functional Interface use case
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> consumer = S -> System.out.println("Hello., " + S);
		
		consumer.accept("Aishu");
		consumer.accept("Aaradhya");
	}

}
