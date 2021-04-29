package com.gaurav.java.thread;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchTest {
public static void main(String[] args) {
	
	
	ExecutorService executorService = Executors.newFixedThreadPool(10);
	CountDownLatch countDownLatch = new   CountDownLatch(18);
	
	for (int i = 0; i < 10; i++) {
		
		executorService.execute(new Worker(i, countDownLatch));
	}
	try {
		//System.out.println(countDownLatch.getCount());
		countDownLatch.await();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("All the prereqistic work has been done");
	executorService.shutdown();
}
}

class Worker implements Runnable {
	private int id;
	private CountDownLatch countDownLatch;
	private Random random;

	public Worker(int id, CountDownLatch countDownLatch) {
		super();
		this.id = id;
		this.countDownLatch = countDownLatch;
	}

	@Override
	public void run() {
		doWork();
		countDownLatch.countDown();
		//countDownLatch.countDown();
		//countDownLatch.countDown();
		//System.out.println("Count"+countDownLatch.getCount());

	}
	private void  doWork()
	{
		System.out.println("Thread with Id::"+id+" started working");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}