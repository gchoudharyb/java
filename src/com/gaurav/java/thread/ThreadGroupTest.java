package com.gaurav.java.thread;

public class ThreadGroupTest {
public static void main(String[] args) {
	
	
	ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
	Thread [] t1 = new Thread[system.activeCount()];
	system.enumerate(t1);
	for (int i = 0; i < t1.length; i++) {
		System.out.println(t1[i].getName()+"...dameon-"+t1[i].isDaemon());
	}
	System.out.println(Thread.currentThread().getThreadGroup().getName());
	System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
	ThreadGroup threadGroup = new ThreadGroup("Gaurav_Group");
	Thread myThread1 = new Thread(threadGroup,"t1");
	Thread myThread2 = new Thread(threadGroup,"t2");
	Thread myThread3 = new Thread(threadGroup,"t3");
	threadGroup.setMaxPriority(1);
	System.out.println(myThread1.getPriority());
	Thread myThread4 = new Thread(threadGroup,"t4");
	System.out.println(myThread4.getPriority());
	
//Thread [] t1 = new Thread[Integer.MAX_VALUE];//it will give Exception in thread "main" 
//java.lang.OutOfMemoryError: Requested array size exceeds
//VM limitat com.gaurav.java.thread.ThreadGroupTest.main(ThreadGroupTest.java:16)


	
}
}
