package com.gaurav.java.thread;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RejectedExecutionHandler;

public class ForkJoinTest {
public static void main(String[] args) {
	ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
	SimpleRecursiveAction simpleRecursiveAction = new  SimpleRecursiveAction(2000);
	forkJoinPool.invoke(simpleRecursiveAction);
	
}
}
class SimpleRecursiveAction extends RecursiveAction
{
private int simulatedWork;

	public SimpleRecursiveAction(int simulatedWork) {
	super();
	this.simulatedWork = simulatedWork;
}

	@Override
	protected void compute() {
		if(simulatedWork > 100)
		{
			System.out.println("Split into parallel task::"+simulatedWork);
			SimpleRecursiveAction simpleRecursiveAction1 = new  SimpleRecursiveAction(simulatedWork/2);
			SimpleRecursiveAction simpleRecursiveAction2 = new  SimpleRecursiveAction(simulatedWork/2);
			simpleRecursiveAction1.fork();
			simpleRecursiveAction2.fork();
			
		}
		else
		{
			System.out.println("No need of parrale work");
		}
	}
}