package com.example.java8.functionalinterfaces.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

//Sample program to implement - Function, Predicate and Consumer Functional Interface
class Student {
	String name;
	int marks;
	
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Aishu", 99));
		students.add(new Student("Virat", 45));
		students.add(new Student("Rohit", 60));
		students.add(new Student("Sammu", 95));
//		1. Display Students Info
//		2. Whose mark is greater than 60
//		3. Display with their grade during display
		
//		Predicate to check iff the student has scored - 60+ marks
		Predicate<Student> hasPassed = S -> S.marks>=60;
		
//		Function to calculate the grade of the student
		Function<Student, Character> getGrade = S -> {
			int marks = S.marks;
			if(marks>=90)
				return 'S';
			else if(marks>=80)
				return 'A';
			else if(marks>=70)
				return 'B';
			else if(marks>=60)
				return 'C';
			else
				return 'F';
		};
		
//		Consumer to display the student details
		Consumer<Student> displayResults = S -> {
			System.out.println("Name: " + S.name +  ", Grade: " + getGrade.apply(S).toString());
		};
		
		for(Student student: students) {
			if(hasPassed.test(student)) {
				displayResults.accept(student);
			}
		}
	}

}
