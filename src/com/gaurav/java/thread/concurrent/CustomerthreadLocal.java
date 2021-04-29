package com.gaurav.java.thread.concurrent;

public class CustomerthreadLocal extends Thread {
static int txnId=0;
private static ThreadLocal<Integer> threadLocal = new ThreadLocal()
{
	protected synchronized Object initialValue() {
	return	++txnId;
	}
};
@Override
	public void run() {
	System.out.println("transaction ID for thread::"+Thread.currentThread().getName()+"="+threadLocal.get());
	} 
}
