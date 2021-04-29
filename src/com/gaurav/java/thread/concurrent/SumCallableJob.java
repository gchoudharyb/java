package com.gaurav.java.thread.concurrent;

import java.util.concurrent.Callable;

public class SumCallableJob implements Callable<Integer> {

	int num;
	public SumCallableJob(int num) {
		this.num=num;
		
	}
	@Override
	public Integer call() throws Exception {
		int sum=0;
		for (int i = 0; i <= num; i++) {
			sum+=i;
		}
		return sum;
	}

}
