package com.gaurav.java.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityQueueTest {
public static void main(String[] args) {
	BlockingQueue<String> priorityQueue = new PriorityBlockingQueue<>();
	new Thread(new PriorityWorker(priorityQueue)::run).start();
	new Thread(new PriorityWorker2(priorityQueue)::run).start();
}
}

class PriorityWorker implements Runnable {
	private BlockingQueue<String> priorityQueue;

	public PriorityWorker(BlockingQueue<String> priorityQueue) {
		super();
		this.priorityQueue = priorityQueue;
	}

	@Override
	public String toString() {
		return "PriorityWorker [priorityQueue=" + priorityQueue + "]";
	}

	@Override
	public void run() {
		try {
			priorityQueue.put("gaurav");
			priorityQueue.put("qaurav");
			Thread.sleep(1000);
			priorityQueue.put("zaurav");
			priorityQueue.put("xaurav");
			priorityQueue.put("caurav");
			Thread.sleep(1000);
			priorityQueue.put("oaurav");
			priorityQueue.put("oaaurav");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class PriorityWorker2 implements Runnable {
	private BlockingQueue<String> priorityQueue;
	public PriorityWorker2(BlockingQueue<String> priorityQueue) {
		super();
		this.priorityQueue = priorityQueue;
	}
	@Override
	public String toString() {
		return "PriorityWorker [priorityQueue=" + priorityQueue + "]";
	}

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
			System.out.println("Take::"+priorityQueue.take());
			System.out.println("Take::"+priorityQueue.take());
			Thread.sleep(1000);
			System.out.println("Take::"+priorityQueue.take());
			System.out.println("Take::"+priorityQueue.take());
			System.out.println("Take::"+priorityQueue.take());
			System.out.println("Take::"+priorityQueue.take());
			Thread.sleep(1000);
			System.out.println("Take::"+priorityQueue.take());
			System.out.println("Take::"+priorityQueue.take());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}