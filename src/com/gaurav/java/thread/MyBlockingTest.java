package com.gaurav.java.thread;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MyBlockingTest {

	static MyBlockingQueur<String> blockingQueue = new MyBlockingQueur<>(50);

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		thread.start();
		thread1.start();
	}

	public static void producer() throws InterruptedException {

		Random random = new Random();
		while (true) {
			String data = random.nextInt(900) + "";
			System.out.println("Produced::" + data);
			Thread.sleep(1000);
			blockingQueue.put(data);
		}
	}

	public static void consumer() throws InterruptedException {
		while (true) {
			Thread.sleep(1000);
			System.out.println("Consumed::" + blockingQueue.get());
		}
	}

}
