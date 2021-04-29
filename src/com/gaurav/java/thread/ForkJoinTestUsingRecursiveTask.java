package com.gaurav.java.thread;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinTestUsingRecursiveTask {
	public static void main(String[] args) {
		ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		SimpleRecursiveTask simpleRecursiveTask = new SimpleRecursiveTask(2000);
		System.out.println(forkJoinPool.invoke(simpleRecursiveTask));
	}
}

class SimpleRecursiveTask extends RecursiveTask<Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int simulatedWork;

	public SimpleRecursiveTask(int simulatedWork) {
		super();
		this.simulatedWork = simulatedWork;
	}

	@Override
	protected Integer compute() {
		if (simulatedWork > 100) {
			System.out.println("parallel task starts::" + simulatedWork);
			SimpleRecursiveTask simpleRecursiveTask1 = new SimpleRecursiveTask(simulatedWork / 2);
			SimpleRecursiveTask simpleRecursiveTask2 = new SimpleRecursiveTask(simulatedWork / 2);

			simpleRecursiveTask1.fork();
			simpleRecursiveTask2.fork();
			int solution = 0;
			solution += simpleRecursiveTask1.join();
			solution += simpleRecursiveTask2.join();

			System.out.println("Solution" + solution);
			return solution;
		} else {
			System.out.println("No need of parallel execution" + simulatedWork);
			return simulatedWork * 2;
		}
	}
}