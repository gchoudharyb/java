package com.gaurav.java.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueTest {
	public static void main(String[] args) {
		BlockingQueue<DelayWorker> blockingQueue = new DelayQueue<>();
		
		try {
			blockingQueue.put(new DelayWorker(10000, "This is first message"));
			blockingQueue.put(new DelayWorker(100000, "This is second message"));
			blockingQueue.put(new DelayWorker(20000, "This is third message"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (!blockingQueue.isEmpty()) {
			try {
				System.out.println(blockingQueue.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class DelayWorker implements Delayed {
	private long duration;
	private String message;

	public DelayWorker(long duration, String message) {
		super();
		this.duration =System.currentTimeMillis()+ duration;
		this.message = message;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public int compareTo(Delayed o) {
		
		return (int) (this.getDuration()-((DelayWorker)o).getDuration());
	}

	@Override
	public long getDelay(TimeUnit unit) {
		// TODO Auto-generated method stub
		return unit.convert(duration - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
	}

	@Override
	public String toString() {
		return "DelayWorker [duration=" + duration + ", message=" + message + "]";
	}
	
}
