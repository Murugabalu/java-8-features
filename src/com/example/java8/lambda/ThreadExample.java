package com.example.java8.lambda;

public class ThreadExample {
	
	public static void main(String[] args) {
		
		Runnable runnable = ()->{
			for(int i=0; i<5; i++)
				System.out.println("Child display.");
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		for(int i=0; i<5; i++)
			System.out.println("Main display.");
		
	}

}
