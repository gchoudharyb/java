package com.gaurav.java.thread;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinPoolTest {
	public static void main(String[] args) {
		ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		int [] arrNum = new int [100000000];
		for (int i = 0; i <100000000; i++) {
			arrNum[i]=i+1;
		}
		long startMs1 = System.currentTimeMillis();
		
		System.out.println(new RecursiveTaskk(arrNum, 0, arrNum.length).arrayElementSum());
		
		long endMs1 = System.currentTimeMillis();
		
		long diff1 = endMs1-startMs1;
		
		System.out.println("Time elapsed native" + diff1);
		long startMs = System.currentTimeMillis();
		RecursiveTaskk recursiveTaskk = new RecursiveTaskk(arrNum, 0, arrNum.length);
		
		
		System.out.println(forkJoinPool.invoke(recursiveTaskk));
		long endMs = System.currentTimeMillis();
		long diff = endMs-startMs;
		System.out.println("Time elapsed" + diff);
	}
}

class RecursiveTaskk extends RecursiveTask<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2246840815271177774L;

	private int[] numArr;
	private int lowIndex;
	private int highIndex;
public RecursiveTaskk() {
	// TODO Auto-generated constructor stub
}
	public RecursiveTaskk(int[] numArr, int lowIndex, int highIndex) {
		this.numArr = numArr;
		this.lowIndex = lowIndex;
		this.highIndex = highIndex;

	}

	@Override
	protected Long compute() {
		if (highIndex-lowIndex > 10000000) {
			int middleIndex = (lowIndex + highIndex) / 2;
			RecursiveTaskk recursiveTaskk1 = new RecursiveTaskk(numArr, lowIndex, middleIndex);
			RecursiveTaskk recursiveTaskk2 = new RecursiveTaskk(numArr, middleIndex, highIndex);
			 invokeAll(recursiveTaskk1, recursiveTaskk2);
			 return Math.addExact(recursiveTaskk1.join(), recursiveTaskk2.join());
		} else {
			return arrayElementSum();
		}

	}

	public long arrayElementSum() {
		long sum = 0;
		for (int i = lowIndex; i < highIndex; i++) {
			sum += numArr[i];
		}
		return sum;
	}
}