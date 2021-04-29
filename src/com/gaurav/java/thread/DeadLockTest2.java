package com.gaurav.java.thread;

public class DeadLockTest2 {
	public static void main(String[] args) {
		MyThreadDeadLock myThreadDeadLock = new MyThreadDeadLock();
		MyThreadDeadLock myThreadDeadLock1 = new MyThreadDeadLock();
		Thread thread = new Thread(() -> 
		{
			try {
				myThreadDeadLock.m1();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		},"Thread_0");
		Thread thread2 = new Thread(() -> 
		{
			try {
				myThreadDeadLock1.m2();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		},"Thread_1");
		thread.start();
		thread2.start(); 
	}
}

class MyThreadDeadLock {
	public synchronized void m1() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println(Thread.currentThread().getName()+"::In m1()");
		m2();
	}

	public synchronized void m2() throws InterruptedException {
		Thread.sleep(6000);
		System.out.println(Thread.currentThread().getName()+"::In m2()");
		m1();
	}
}
