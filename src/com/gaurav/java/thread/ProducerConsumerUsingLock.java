package com.gaurav.java.thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerUsingLock {

}
class MyBlockingQueur<T>
{
	private Queue<T> queue;
	ReentrantLock lock = new ReentrantLock(true);
	Condition newcondition  = lock.newCondition();
	Condition oldcondition  = lock.newCondition();
	private int max=16;
	
	public MyBlockingQueur() {
		queue = new LinkedList<>();
	}

	public MyBlockingQueur(int size) {
		queue = new LinkedList<>();
		this.max=size;
	}
	void put(T element) throws InterruptedException
	{
		try {
			lock.lock();
			
			if(queue.size()==max) 
			{
				newcondition.await();;
			}
			queue.add(element);
			newcondition.signalAll();
		} finally {
			lock.unlock();
		}
		
	}
	 T get() throws InterruptedException
	{
		try {
			lock.lock();
			if(queue.size()==0)
			{
				oldcondition.await();
			}
			T t =queue.remove();
			oldcondition.signalAll();
			return t;
		} finally {
			lock.unlock();
		}
		
	}
}