package com.example.java8.methodreference;

//Sample Example for constructor method - Using lambda expression

class Sample {
	public Sample() {
		System.out.println("Constructor inside sample class");
	}
}

interface FactorySample {
	Sample get();
}

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorySample obj = ()->{
			Sample s = new Sample();
			return s;
		};
		
		Sample s = obj.get();
	}

}
