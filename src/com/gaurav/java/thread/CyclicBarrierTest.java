package com.gaurav.java.thread;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierTest {
	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		CyclicBarrier barrier = new CyclicBarrier(5, ()->System.out.println("all task has been done"));
		System.out.println("Main");

		for (int i = 0; i < 5; i++) {

			executorService.execute(new Worker1(i, barrier));
		}
		System.out.println("Main1");

		executorService.shutdown();
		
	}
}

class Worker1 implements Runnable {
	private int id;
	private CyclicBarrier cyclicBarrier;
	private Random random;

	public Worker1(int id,CyclicBarrier cyclicBarrier) {
		super();
		this.id = id;
		this.random=new Random();
		this.cyclicBarrier = cyclicBarrier;
	}

	@Override
	public void run() {
		doWork();

	}

	private void doWork() {
		System.out.println("Thread with Id::" + id + " started working");
		try {
			Thread.sleep(random.nextInt(3000));

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread with Id::" + id + " finished working");
		System.out.println(cyclicBarrier.getNumberWaiting());
		try {
			cyclicBarrier.await();
			//cyclicBarrier.getParties();
			System.out.println("After await");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
}