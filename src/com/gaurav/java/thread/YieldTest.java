package com.gaurav.java.thread;

public class YieldTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thread Name: "+Thread.currentThread().getName());
			}
		});
		
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thread Name: "+Thread.currentThread().getName());
				Thread.yield();
			}
		});
		t1.start();
		t2.start();
	}
}
