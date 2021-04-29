package com.gaurav.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSequentiallyRun {
	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(()->System.out.println(Thread.currentThread().getName()));
		Thread thread2 = new Thread(()->System.out.println(Thread.currentThread().getName()));
		Thread thread3 = new Thread(()->System.out.println(Thread.currentThread().getName()));
		thread1.start();
		thread1.join();
		thread2.start();
		thread2.join();
		thread3.start();
		thread3.join();
		System.out.println("Done");
		
		ExecutorService executors = Executors.newSingleThreadExecutor();
		executors.submit(new Thread(()->System.out.println(Thread.currentThread().getName())) );
		
	}
}
