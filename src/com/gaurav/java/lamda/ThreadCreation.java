package com.gaurav.java.lamda;

public class ThreadCreation {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> System.out.println("Thread Job Start"));

		thread.start();
		int t =100;
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
					System.out.println(t);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		thread2.start();
	}
}
