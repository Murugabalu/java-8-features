package com.example.java8.functionalinterfaces.bi;

import java.util.function.BiConsumer;

//Increment employee salary based on user Input
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<Employee, Integer> incrementSalary = (E, I) -> {
			System.out.println("Altered salary: " + (E.per_day_sal + I));
		};
		
		Employee emp1 = new Employee(101, "Rohit", 15000);
		
		incrementSalary.accept(emp1, 2000);
	}

}
