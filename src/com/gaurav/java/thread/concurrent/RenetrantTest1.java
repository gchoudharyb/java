package com.gaurav.java.thread.concurrent;

import java.util.concurrent.locks.ReentrantLock;

public class RenetrantTest1 {
public static void main(String[] args)
{
	Display display = new Display();
	Mythread5 mythread5 = new Mythread5(display, "gaurav");
	Mythread5 mythread6 = new Mythread5(display, "gaurav1");
	mythread5.start();
	mythread6.start();
}
	
	
	
}
class Display
{
	ReentrantLock lock = new ReentrantLock();
	public  void  display(String name) 
	{
		lock.lock();
		for (int i = 0; i < 10; i++) {
			System.out.println("Welcome::"+name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	//	lock.unlock();
	}
}
class Mythread5 extends Thread
{
	String name;
	Display display;
	public Mythread5(Display d,String name) {
		this.name=name;
		this.display =d;
	}
	@Override
	public void run() {
		display.display(name);
	}
}