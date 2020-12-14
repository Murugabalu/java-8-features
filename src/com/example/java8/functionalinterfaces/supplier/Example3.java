package com.example.java8.functionalinterfaces.supplier;

import java.util.function.Supplier;

//Get a random string from a String array
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> randomName = () -> {
			String[] names = { "Aishu", "Aaradhya", "Ammu", "Vennila", "Mahi", "VK" };
			return names[(int) (Math.random() * 6)];
		};
		System.out.println(randomName.get());
		System.out.println(randomName.get());
		System.out.println(randomName.get());
		System.out.println(randomName.get());
		System.out.println(randomName.get());
		System.out.println(randomName.get());
		System.out.println(randomName.get());
	}

}
