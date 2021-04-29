package com.gaurav.java.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CustomBlockingQueueTest {
	public static void main(String[] args) {
		CustomBlockingQueue blockingQueue = new CustomBlockingQueue(1);
		Thread pdoducerThread = new Thread(()->{
			try {
				for (int i = 0; i < 12; i++) {
					blockingQueue.enqueue(i);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread consumerThread = new Thread(()->
		{
			try {
				for (int i = 0; i < 12; i++) {
					System.out.println("Consumed" + blockingQueue.dequeue());
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		pdoducerThread.start();
		consumerThread.start();
	}
	
}

class CustomBlockingQueue {
	final Lock lock = new ReentrantLock();
	final Condition producedCondition = lock.newCondition();
	final Condition consumedCondition = lock.newCondition();
	private  int size;
	private int count;
	int putIndex;
	int takeIndex;
	Object[] array;
	public CustomBlockingQueue() {
		// TODO Auto-generated constructor stub
	}

	public CustomBlockingQueue(int size) {
		this.size = size;
		 array = new Object[size];
	}

	

	public void enqueue(Object x) throws InterruptedException {
		lock.lock();

		try {
			while (count == size) {
				producedCondition.await();
			}
			array[putIndex] = x;
			System.out.println("Producing - " + x);
			putIndex++;
			if (putIndex == size) {
				putIndex = 0;
			}
			++count;
			consumedCondition.signal();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public Object dequeue() throws InterruptedException {
		lock.lock();

		try {
			while (count == 0) {
				consumedCondition.await();
			}
			Object object = array[takeIndex];
			takeIndex++;
			if (takeIndex == size) {
				takeIndex = 0;
			}
			--count;
			producedCondition.signal();
			return object;
		} finally {
			lock.unlock();
		}
	}

}