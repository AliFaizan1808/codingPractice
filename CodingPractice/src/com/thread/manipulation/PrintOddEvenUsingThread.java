package com.thread.manipulation;

public class PrintOddEvenUsingThread {
	

	//Write a program to print odd even numbers using threads in sequence?
	public static void main(String[] args) throws InterruptedException {
		
		int minNumber = 1;
		int maxNumber = 11;
		
		Thread t1 = new Thread(() -> {
			
			int number = minNumber;
			while(number < maxNumber) {
				if(number % 2 == 0) {
					System.out.println(number + "--" +Thread.currentThread());
				}
				number ++;
			}
		});
		
		
		Thread t2 = new Thread(() -> {
			int number = minNumber;
			while(number < maxNumber) {
				if(number % 2 != 0) {
					System.out.println(number + "--" +Thread.currentThread());
				}
				number ++;
			}
			
		});
		
		t1.setName("Thread One");
		t2.setName("Thread Two");
		
		t1.start();
		t2.start();
		

	}

}
