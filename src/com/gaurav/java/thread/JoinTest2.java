package com.gaurav.java.thread;

public class JoinTest2 {
	public static void main(String[] args) throws InterruptedException {
		
		MyThread1 myThread = new MyThread1();
		myThread.setName("Gaurav"
				+ "");
		Thread.currentThread().setName("Tejaswini1");
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		myThread.abc(Thread.currentThread());
		//myThread.start();
		System.out.println(Thread.currentThread().getName()+"is about to call join on thread "+myThread.getName());
		myThread.join();
		for(int i=0;i<=5;i++)
		{
			
			System.out.println(Thread.currentThread().getName()+"  Thread is executing");
			Thread.sleep(2000);
			
		}
	}

}

class MyThread1 extends Thread
{
	public Thread mt;
	@Override
	public void run() {

		
		try {
			mt.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		for(int i=0;i<15;i++) {
			System.out.println(Thread.currentThread().getName()+"  Thread is executing");
		}
	}
	public void abc(Thread mt1)
	{
		mt = mt1;
		super.start();
		System.out.println(Thread.currentThread().getName()+"               tets");
		
		
	}
}
class MyThread2 extends Thread
{
	public Thread mt;
	@Override
	public void run() {
		
		
		try {
			mt.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<15;i++) {
			System.out.println(Thread.currentThread().getName()+"  Thread is executing");
		}
	}
	public void abc(Thread mt1)
	{
		mt = mt1;
		super.start();
		
		
	}
}
