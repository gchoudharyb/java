package com.gaurav.java.thread;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinPoolTestMain {
public static void main(String[] args) {
	ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
	ForkJoinPoolTest forkJoinPoolTest = new  ForkJoinPoolTest();
}
}
