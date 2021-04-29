package com.gaurav.java.thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerUsingLockSelf {
	public static void main(String[] args) {
		MyBlockingQueue<Integer> blockingQueue = new MyBlockingQueue(50);

		Thread producerThread = new Thread(() -> {
			while (true) {
				for (int i = 0; i < 100; i++) {
					blockingQueue.put(i);
				}
			}
		});
		
		Thread consumerThread = new Thread(()-> 
		{
			while(true)
			{
				System.out.println("Consumed"+blockingQueue.get());
			}
		}
				
				);
		
		producerThread.start();
		consumerThread.start();
	}

}

class MyBlockingQueue<T> {
	private Queue<T> queue;
	private int maxSize = 16;
	private ReentrantLock lock = new ReentrantLock();
	Condition putCondition = lock.newCondition();
	Condition getCondition = lock.newCondition();

	public MyBlockingQueue() {
		this.queue = new LinkedList<>();
	}

	public MyBlockingQueue(int maxSize) {
		this.queue = new LinkedList<>();
		this.maxSize = maxSize;
	}

	public void put(T t) {
		lock.lock();
		try {
			if (queue.size() == maxSize) {
				putCondition.await();
			}
			queue.add(t);
			getCondition.signalAll();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			lock.unlock();
		}
	}

	public T get() {
		lock.lock();
		T t = null;
		try {
			if (queue.size() == 0) {
				getCondition.await();
			}
			t = queue.remove();
			getCondition.signalAll();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			lock.unlock();
		}
		return t;
	}
}