package com.example.java8.methodreference;

//sample example to use Method reference operator
interface Interf {
	void add(int num1, int num2);
}

public class Example1 {
	
	public static void add1(int num1, int num2) {
		System.out.println("The sum is: " + (num1+num2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interf obj = Example1::add1;
		obj.add(10, 20);
	}

}
