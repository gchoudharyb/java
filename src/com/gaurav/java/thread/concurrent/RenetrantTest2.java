package com.gaurav.java.thread.concurrent;

import java.util.concurrent.locks.ReentrantLock;

public class RenetrantTest2 {

public static void main(String[] args)
{
	Display1 display = new Display1();
	Mythread6 mythread5 = new Mythread6(display, "gaurav");
	Mythread6 mythread6 = new Mythread6(display, "gaurav1");
	mythread5.start();
	mythread6.start();
}
	
	
	

}
class Display1
{
	ReentrantLock lock = new ReentrantLock();
	public  void  display(String name) 
	{
		if(lock.tryLock())
		{
			for (int i = 0; i < 10; i++) {
				System.out.println("Welcome::"+name);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			lock.unlock();
		}
		else
		{
			System.out.println("I am working another task::"+name);
		}

	}
}
class Mythread6 extends Thread
{
	String name;
	Display1 display;
	public Mythread6(Display1 d,String name) {
		this.name=name;
		this.display =d;
	}
	@Override
	public void run() {
		display.display(name);
	}
}