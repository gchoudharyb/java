package com.gaurav.java.thread;

import java.util.concurrent.Exchanger;

public class ExchangerTest {
public static void main(String[] args) {
	Exchanger<Integer> exchanger = new  Exchanger<>();
	new Thread(new ExchangerWorker(exchanger)::run).start();
	new Thread(new ExchangerWorker2(exchanger)::run).start();
}
}
class ExchangerWorker implements Runnable
{
	private Exchanger<Integer> exchanger;
	
	private int counter;

	public ExchangerWorker(Exchanger<Integer> exchanger) {
		super();
		this.exchanger = exchanger;
	}



	@Override
	public void run() {
		while(true)
		{
		counter = counter+1;
		System.out.println("Second Thread"+Thread.currentThread().getName()+ " incre,mented the counter::"+counter);
		try {
			counter = exchanger.exchange(counter);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}


class ExchangerWorker2 implements Runnable
{
	private Exchanger<Integer> exchanger;
	
	private int counter;

	public ExchangerWorker2(Exchanger<Integer> exchanger) {
		super();
		this.exchanger = exchanger;
	}



	@Override
	public void run() {
		while(true)
		{
		counter = counter-1;
		System.out.println("First Thread \"+Thread.currentThread().getName()+ \"  decremented the counter::"+counter);
		try {
			counter = exchanger.exchange(counter);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}