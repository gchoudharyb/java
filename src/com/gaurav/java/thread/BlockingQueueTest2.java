package com.gaurav.java.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest2 {
public static void main(String[] args) {
	BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(50);
	
	FirstWorker firstWorker = new  FirstWorker(blockingQueue);
	SecongWorker secongWorker = new SecongWorker(blockingQueue);
	
	new Thread(firstWorker).start();
	new Thread(secongWorker).start();
	
}
}
class FirstWorker implements Runnable
{
	private BlockingQueue<Integer> blockingQueue;

	
	public FirstWorker(BlockingQueue<Integer> blockingQueue) {
		super();
		this.blockingQueue = blockingQueue;
	}



	@Override
	public void run() {
		int couter = 0;
		while(true)
		{
		try {
			blockingQueue.put(couter);
			System.out.println("Putting item into the queue::"+couter);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		couter++;
		}
		
	}
}

class SecongWorker implements Runnable
{
	private BlockingQueue<Integer> blockingQueue;

	
	public SecongWorker(BlockingQueue<Integer> blockingQueue) {
		super();
		this.blockingQueue = blockingQueue;
	}



	@Override
	public void run() {
		while(true)
		{
		try {
			int item = blockingQueue.take();
			System.out.println("taking item from the queue::"+item);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
}