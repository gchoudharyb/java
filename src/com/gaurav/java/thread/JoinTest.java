package com.gaurav.java.thread;

public class JoinTest {
	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread();
		myThread.setName("Gaurav" + "");
		Thread.currentThread().setName("Tejaswini");
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		myThread.start();
		System.out.println(Thread.currentThread().getName() + "is about to call join on thread " + myThread.getName());
		myThread.join();
		for (int i = 0; i < 15; i++) {
			System.out.println(Thread.currentThread().getName() + "  Thread is executing");
		}
	}

}

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 15; i++) {
			System.out.println(Thread.currentThread().getName() + "  Thread is executing");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}