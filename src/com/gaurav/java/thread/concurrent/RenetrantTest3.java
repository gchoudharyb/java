package com.gaurav.java.thread.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class RenetrantTest3 {


public static void main(String[] args)
{
	Display2 display = new Display2();
	Mythread7 mythread5 = new Mythread7(display, "gaurav");
	Mythread7 mythread6 = new Mythread7(display, "gaurav1");
	mythread5.start();
	mythread6.start();
}
	
	
	



}
class Display2
{
	ReentrantLock lock = new ReentrantLock();
	public  void  display(String name) 
	{
		do
		{
			try {
				if(lock.tryLock(5000,TimeUnit.MILLISECONDS))
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
					break;
				}
				else
				{
					System.out.println("I am working another task::"+name+" I will try again");
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	while(true);
		

	}
}
class Mythread7 extends Thread
{
	String name;
	Display2 display;
	public Mythread7(Display2 d,String name) {
		this.name=name;
		this.display =d;
	}
	@Override
	public void run() {
		display.display(name);
	}
}
