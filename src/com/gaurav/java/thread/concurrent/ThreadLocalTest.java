package com.gaurav.java.thread.concurrent;

public class ThreadLocalTest {
public static void main(String[] args) {
	ThreadLocal threadLocal = new ThreadLocal();
	System.out.println(threadLocal.get());
	threadLocal.set(10);
	System.out.println(threadLocal.get());
	threadLocal.remove();
	System.out.println(threadLocal.get());
	
	ThreadLocal threadLocal1 = new ThreadLocal()
		{
			protected Object initialValue() {
				return 5;
			}
		};
		System.out.println(threadLocal1.get());
		threadLocal1.set(100);
		System.out.println(threadLocal1.get());
		threadLocal1.remove();
		System.out.println(threadLocal1.get());
}
}
