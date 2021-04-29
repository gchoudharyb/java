package com.gaurav.java.thread.concurrent;

import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
public static void main(String[] args) {
	ReentrantLock reentrantLock = new ReentrantLock();
	reentrantLock.lock();
	System.out.println(reentrantLock.getHoldCount());
	reentrantLock.lock();
	System.out.println(reentrantLock.getHoldCount());
	System.out.println(reentrantLock.getQueueLength());
	System.out.println(reentrantLock.hasQueuedThreads());
	System.out.println(reentrantLock.isFair());
	reentrantLock.unlock();
	System.out.println(reentrantLock.getHoldCount());
	reentrantLock.unlock();
	System.out.println(reentrantLock.getHoldCount());
}
}
