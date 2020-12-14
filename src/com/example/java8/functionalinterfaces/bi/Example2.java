package com.example.java8.functionalinterfaces.bi;

import java.util.function.BiFunction;

//Calculate Employee salary based on his attendance

class Employee {
	int emp_no;
	String name;
	int per_day_sal;
	
	public Employee(int emp_no, String name, int per_day_sal) {
		this.emp_no = emp_no;
		this.name = name;
		this.per_day_sal = per_day_sal;
	}
}

class TimeSheet {
	int emp_no;
	int worked_days;
	
	public TimeSheet(int emp_no, int worked_days) {
		this.emp_no = emp_no;
		this.worked_days = worked_days;
	}
}

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(101, "Balu", 3000);
		TimeSheet ts = new TimeSheet(101, 20);
		
		BiFunction<Employee, TimeSheet, Integer> empSalary = (E, T) -> {
			Integer sal = (E.per_day_sal * T.worked_days);
			return sal;
		};
		
		System.out.println("Employee, " + emp.name + " Salary is " + empSalary.apply(emp, ts));
	}

}
