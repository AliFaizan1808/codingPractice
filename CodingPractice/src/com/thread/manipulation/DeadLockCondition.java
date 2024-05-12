package com.thread.manipulation;

public class DeadLockCondition {
	
	
//	1. Thread 1 acquires lock1.
//	2. Before releasing lock1, Thread 1 attempts to acquire lock2.
//	3. Meanwhile, Thread 2 acquires lock2.
//	4. Before releasing lock2, Thread 2 attempts to acquire lock1.
//	5. Both threads are now waiting for the other thread to release the lock it needs, resulting in a deadlock

	private static final Object lock1 = new Object();
	private static final Object lock2 = new Object();

	public static void main(String[] args) {

		Thread thread1 = new Thread(() -> {
			synchronized (lock1) {
				System.out.println("Thread 1 acquired lock1");
				try {
					Thread.sleep(100); // Introduce a delay to ensure both threads try to acquire locks simultaneously
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread 1 waiting to acquire lock2");
				synchronized (lock2) {
					System.out.println("Thread 1 acquired lock2");
				}
			}
		});


		Thread thread2 = new Thread(() -> {
			synchronized (lock2) {
				System.out.println("Thread 2 acquired lock2");
				System.out.println("Thread 2 waiting to acquire lock1");
				synchronized (lock1) {
					System.out.println("Thread 2 acquired lock1");
				}
			}
		});


		thread1.start();
		thread2.start();
	}

}
