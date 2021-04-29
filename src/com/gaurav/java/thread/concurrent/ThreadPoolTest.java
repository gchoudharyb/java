package com.gaurav.java.thread.concurrent;

import java.awt.geom.Point2D.Double;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
public static void main(String[] args) {
	PrintJob [] jobs = {new PrintJob("JOB1"),new PrintJob("JOB2"),new PrintJob("JOB3")};
	ExecutorService service = Executors.newFixedThreadPool(5);
	for (PrintJob printJob : jobs) {
		service.submit(printJob);
	}
	service.shutdown();
}
}
