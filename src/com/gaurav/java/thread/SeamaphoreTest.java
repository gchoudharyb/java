package com.gaurav.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SeamaphoreTest {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 13; i++) {
			executorService.execute(Downloader.INSTANCE::downLoadData);

		}
		//executorService.shutdown();
	}

}

enum Downloader {
	INSTANCE;
	private Semaphore semaphore = new Semaphore(0, true);
	

	public void downLoadData() {
		try {
			semaphore.acquire();
			downLoad();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			semaphore.release();
		}
	}

	private void downLoad() {
		System.out.println("Downloading data from the Web");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}