package com.gaurav.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FixedThreadPoolEx {
	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		ExecutorService executorService = Executors.newFixedThreadPool(11);
		for (int i = 0; i < 12; i++) {
			executorService.execute(()->
			{
				System.out.println("Task is being executed by Thead::"+Thread.currentThread().getName());
				long ns =  (long) (Math.random()*5);
				try {
					TimeUnit.SECONDS.sleep(ns);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		}
		executorService.shutdown();
	}
}
