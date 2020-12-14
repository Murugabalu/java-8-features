package com.example.java8.methodreference;

//Sample to invoke Constructor using method reference (Sample and Factory sample are in Example4.java)
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorySample obj = Sample::new;
		Sample s2 = obj.get();
		
	}

}
