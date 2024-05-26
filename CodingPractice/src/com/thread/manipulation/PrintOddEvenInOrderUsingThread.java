package com.thread.manipulation;

public class PrintOddEvenInOrderUsingThread {

	public static final int maxNumber = 11;
	int minNumber = 1;


	public synchronized void printEven() throws InterruptedException {

		while(minNumber < maxNumber) {
			if(minNumber % 2 == 0) {
				wait();
				System.out.println(minNumber + "--" +Thread.currentThread());
			}
			minNumber ++;
			notify();
		}
	}

	public synchronized void printOdd() throws InterruptedException {

		while(minNumber < maxNumber) {
			if(minNumber % 2 != 0) {
				wait();
				System.out.println(minNumber + "--" +Thread.currentThread());
			}
			minNumber ++;
			notify();
		}
	}

	public static void main(String[] args) {
		PrintOddEvenInOrderUsingThread printer = new PrintOddEvenInOrderUsingThread();
		Thread t1 = new Thread(() -> {
			try {
				printer.printEven();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});


		Thread t2 = new Thread(() -> {
			try {
				printer.printOdd();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		t1.start();
		t2.start();
	}

}
