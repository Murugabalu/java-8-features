package com.example.java8.functionalinterfaces.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

//Student grade, using Function - Functional Interface
//Check if the student has acquired pass mark using Predicate - Functional Interface
class Student {
	
	String name;
	int marks;
	
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
}
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Aishu", 100));
		students.add(new Student("Aaradhya", 90));
		students.add(new Student("Virat", 99));
		students.add(new Student("Rohit", 85));
		students.add(new Student("Sam", 99));
		students.add(new Student("Bunny", 40));
		
		Function<Student, Character> calculateGrade = S -> {
			int marks = S.marks;
			Character grade = null;
			if(marks>90) {
				grade = 'A';
			} else if(marks>80&&marks<=90) {
				grade = 'B';
			} else if(marks>70&&marks<=80) {
				grade = 'C';
			} else if(marks>60&&marks<=70) {
				grade = 'D';
			} else if(marks>50&&marks<=60) {
				grade = 'E';
			} else {
				grade = 'F';
			}
			return grade;
		};
		
//		To check whether the student has passed the exam
		Predicate<Student> hasPassed = S -> S.marks>=50;
		
		for(Student student: students) {
			if(hasPassed.test(student))
				System.out.println(String.format("%s with marks %d has acquired grade %c", student.name, student.marks, calculateGrade.apply(student)));
		}

	}

}
