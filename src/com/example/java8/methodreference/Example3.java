package com.example.java8.methodreference;

//Runnable Interface - With Method Reference
public class Example3 {
	
	public void impl() throws InterruptedException {
		for(int i=0; i<10; i++) {
			Thread.sleep(200);
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Example3 obj = new Example3();
		Runnable r = () -> {
			try {
				obj.impl();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
