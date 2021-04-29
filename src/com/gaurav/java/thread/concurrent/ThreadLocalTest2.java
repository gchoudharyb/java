package com.gaurav.java.thread.concurrent;

public class ThreadLocalTest2 {
public static void main(String[] args) {
	CustomerthreadLocal customerthreadLocal1 = new CustomerthreadLocal();
	CustomerthreadLocal customerthreadLocal2 = new CustomerthreadLocal();
	CustomerthreadLocal customerthreadLocal3 = new CustomerthreadLocal();
	CustomerthreadLocal customerthreadLocal4 = new CustomerthreadLocal();
	CustomerthreadLocal customerthreadLocal5 = new CustomerthreadLocal();
	customerthreadLocal1.start();
	customerthreadLocal2.start();
	customerthreadLocal3.start();
	customerthreadLocal4.start();
	customerthreadLocal5.start();
}
}
