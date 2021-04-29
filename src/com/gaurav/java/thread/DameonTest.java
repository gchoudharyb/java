package com.gaurav.java.thread;

public class DameonTest {
public static void main(String[] args) {
	DameonThread dameonThread = new DameonThread();
	dameonThread.setDaemon(true);
	dameonThread.start();
	System.out.println("End of main Thread");
}
	
}
class DameonThread extends Thread
{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}