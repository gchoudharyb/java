package com.gaurav.java.thread.concurrent;

public class CustomerInheritableThreadLocal extends Thread{
private static Integer custId=0;

 static InheritableThreadLocal inheritableThreadLocal = new InheritableThreadLocal()
{
	protected synchronized Object initialValue() {
		return ++custId;
	}
};
	
	
@Override
public void run() {
	System.out.println("transaction ID for thread::"+Thread.currentThread().getName()+"="+inheritableThreadLocal.get());
}
}
class MyThread8 extends Thread
{
	@Override
	public void run() {
		System.out.println(CustomerInheritableThreadLocal.inheritableThreadLocal.get());
	}
}