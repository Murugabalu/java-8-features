package com.example.java8.functionalinterfaces.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Date> systemDate = () -> new Date();
		System.out.println(systemDate.get());
	}

}
