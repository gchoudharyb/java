package com.gaurav.java.thread.concurrent;

import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SumTest {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		SumCallableJob[] sumCallableJobs = { new SumCallableJob(10), new SumCallableJob(100),
				new SumCallableJob(999999) };
		ExecutorService service = Executors.newFixedThreadPool(5);
		for (SumCallableJob sumCallableJob : sumCallableJobs) {
			Future<Integer> future = service.submit(sumCallableJob);
			System.out.println("SUM::" + future.get());
		}
		service.shutdown();
	}
}
