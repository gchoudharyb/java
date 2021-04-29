package com.gaurav.java.thread;

public class PrintEvenOddUsingThread {
	public static void main(String[] args) {
		EvesynnOdd evesynnOdd = new EvesynnOdd(10);
		Thread thread1 = new Thread(evesynnOdd::printOdd);
		Thread thread2 = new Thread(evesynnOdd::printEven);
		thread1.start();
		thread2.start();
	}

}

class EvesynnOdd {
	int num;
	int counter = 1;

	public EvesynnOdd(int num) {
		this.num = num;
	}

	public synchronized void printEven() {
		while (counter < num) {
			while (counter % 2 == 1) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Even "+counter + " ");
			counter++;
			notify();
		}
	}

	public synchronized void printOdd() {
		while (counter < num) {
			while (counter % 2 == 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("ODD" + counter + " ");
			counter++;
			notify();
		}
	}
}