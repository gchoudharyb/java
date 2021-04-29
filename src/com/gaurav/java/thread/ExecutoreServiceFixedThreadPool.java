package com.gaurav.java.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutoreServiceFixedThreadPool {
public static void main(String[] args) {
	ExecutorService executorService = Executors.newFixedThreadPool(12);
	for (int i = 0; i < 20; i++) {
		
		executorService.execute(()->System.out.println(Thread.currentThread().getName()));
	}
}
}
