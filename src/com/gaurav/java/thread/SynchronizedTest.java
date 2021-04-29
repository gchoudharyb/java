package com.gaurav.java.thread;

public class SynchronizedTest {
public static void main(String[] args) {
	Account account1 = new Account();
	//Account account2 = new Account();
	MyThreadNew myThreadNew1 = new MyThreadNew(account1);
	MyThreadNew myThreadNew2 = new MyThreadNew(account1);
	myThreadNew1.setName("Tejaswini");
	myThreadNew2.setName("Gaurav");
	myThreadNew1.start();
	myThreadNew2.start();
	
}
}
