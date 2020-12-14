package com.example.java8.methodreference;

//Runnable Class - with functional Interface (lambda expression)
public class Example2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Runnable r = ()->{
			for(int i=0; i<10; i++) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Child Thread");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0; i<10; i++) {
			Thread.sleep(200);
			System.out.println("Main Thread");
		}
	}

}
