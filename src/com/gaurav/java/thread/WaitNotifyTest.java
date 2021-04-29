package com.gaurav.java.thread;

public class WaitNotifyTest {
	public static void main(String[] args) throws InterruptedException {
		MyThread3 thread3 = new MyThread3();
		MyThread3 thread4 = new MyThread3();
		MyThread3 thread5 = new MyThread3();
		thread3.start();
		thread4.start();
		thread5.start();
		synchronized (thread3) {
			thread3.wait();
		}
		synchronized (thread4) {
			thread4.wait();
		}
		synchronized (thread5) {
			thread5.wait();
		}
		
		System.out.println(thread3.totalSum);
	}
}
class MyThread3 extends Thread
{
	int totalSum = 0;
	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			totalSum+=i;
		}
		synchronized (this) {
			this.notifyAll();
		}
		
	}
}
