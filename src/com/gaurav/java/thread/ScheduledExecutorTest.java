package com.gaurav.java.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorTest {
public static void main(String[] args) {
	ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
	executorService.schedule(()->System.out.println("schedule"), 10000,TimeUnit.MILLISECONDS);
	executorService.scheduleAtFixedRate(()->System.out.println("stock"), 1000, 2000, TimeUnit.MILLISECONDS);
	executorService.scheduleWithFixedDelay(()->System.out.println("stock"), 1000, 2000, TimeUnit.MILLISECONDS);
	
}
}
