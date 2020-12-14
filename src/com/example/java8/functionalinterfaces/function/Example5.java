package com.example.java8.functionalinterfaces.function;

import java.util.ArrayList;
import java.util.function.Function;

//Find total salary of all Employees using Function - Functional Interface

class Employee {
	String name;
	String designation;
	double salary;
	
	public Employee(String name, String designation, double salary) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	
}

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Balu", "Associate", 50000));
		employees.add(new Employee("Raghav", "Senior Associate", 80000));
		employees.add(new Employee("Sharma", "Associate", 55000));
		
		Function<ArrayList<Employee>, Double> calculateTotalSalary = E -> {
			double totalSalary = 0;
			for(Employee e: E) {
				totalSalary += e.salary;
			}
			return totalSalary;
		};
		
		System.out.println(String.format("Total salaries of employees is: %.2f", calculateTotalSalary.apply(employees)));
		
	}

}
