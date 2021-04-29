package com.gaurav.java.thread;

public class DeadLockTest {
	public static void main(String[] args) {
		DeadLock deadLock = new DeadLock();
		deadLock.lock(deadLock);
	}
	

}
class A 
{
	public synchronized void m1(B b) throws InterruptedException
	{
		Thread.sleep(1000);
		b.m2();
	}
	public synchronized void m2()
	{
		
	}
}

class B 
{
	public synchronized void m1(A a) throws InterruptedException
	{
		Thread.sleep(1000);
		a.m2();
	}
	public synchronized void m2()
	{
		
	}
}
class DeadLock extends Thread
{
	A a = new A();
	B b = new B();
	
	void lock(DeadLock deadLock)
	{
		try {
			deadLock.start();
			a.m1(b);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void run() {
		try {
			b.m1(a);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}