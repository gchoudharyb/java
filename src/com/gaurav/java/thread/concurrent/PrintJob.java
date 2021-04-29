package com.gaurav.java.thread.concurrent;

public class PrintJob extends Thread {
	String name;
public PrintJob(String name) {
	this.name=name;
}
	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Welcome JOB::"+name+" Thread name :: "+Thread.currentThread().getName());
		}
	}
}
