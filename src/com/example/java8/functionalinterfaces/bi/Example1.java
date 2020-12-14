package com.example.java8.functionalinterfaces.bi;

import java.util.ArrayList;
import java.util.function.BiFunction;

//Create a student Object by taking 2 Inputs - Using BiFunction - Functional Interface

class Student {
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "(" + name + ", " + age + ")";
	}
	
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> students = new ArrayList<Student>();
		
		BiFunction<String, Integer, Student> createStudent = (N, A) -> {
			Student student = new Student(N, A);
			return student;
		};
		
		students.add(createStudent.apply("Aishu", 24));
		students.add(createStudent.apply("Ammu", 25));
		students.add(createStudent.apply("Vennila", 27));
		students.add(createStudent.apply("Deepika", 21));
		
		System.out.println(students);
	}

}
