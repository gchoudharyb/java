package com.gaurav.java.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import com.gaurav.java.thread.ReadWriteLock.InventoryDatabase;

public class ReadWriteExample {
	public static final int HIGHEST_PRICE = 1000;

	public static void main(String[] args) throws InterruptedException {
		InventoryDatabase inventoryDatabase = new InventoryDatabase();

		Random random = new Random();
		for (int i = 0; i < 100000; i++) {
			inventoryDatabase.addItem(random.nextInt(HIGHEST_PRICE));
		}

		Thread writerThread = new Thread(() -> {
			while (true) {
				inventoryDatabase.addItem(random.nextInt(HIGHEST_PRICE));
				inventoryDatabase.removeItem(random.nextInt(HIGHEST_PRICE));
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		writerThread.setDaemon(true);
		writerThread.start();

		int numberOfReaderThreads = 7;
		List<Thread> readers = new ArrayList<>();

		for (int readerIndex = 0; readerIndex < numberOfReaderThreads; readerIndex++) {
			Thread reader = new Thread(() -> {
				for (int i = 0; i < 100000; i++) {
					int upperBoundPrice = random.nextInt(HIGHEST_PRICE);
					int lowerBoundPrice = upperBoundPrice > 0 ? random.nextInt(upperBoundPrice) : 0;
					inventoryDatabase.getNumberOfItemsInPriceRange(lowerBoundPrice, upperBoundPrice);
				}
			});

			reader.setDaemon(true);
			readers.add(reader);
		}

		long startReadingTime = System.currentTimeMillis();
		for (Thread reader : readers) {
			reader.start();
		}
		System.out.println(Thread.currentThread().getName());
		for (Thread reader : readers) {
			reader.join();
		}

		long endReadingTime = System.currentTimeMillis();

		System.out.println(String.format("Reading took %d ms", endReadingTime - startReadingTime));
	}

	public class Inventory {
		private TreeMap<Integer, Integer> priceToCountMap = new TreeMap<>();
		ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
		Lock readlock = reentrantReadWriteLock.readLock();
		Lock writeLock = reentrantReadWriteLock.writeLock();

		public int getNumberOfItemsInPriceRange(int lowerBound, int upperBound) {
			readlock.lock();
			try {
				Integer fromKey = priceToCountMap.ceilingKey(lowerBound);

				Integer toKey = priceToCountMap.floorKey(upperBound);

				if (fromKey == null || toKey == null) {
					return 0;
				}

				NavigableMap<Integer, Integer> rangeOfPrices = priceToCountMap.subMap(fromKey, true, toKey, true);

				int sum = 0;
				for (int numberOfItemsForPrice : rangeOfPrices.values()) {
					sum += numberOfItemsForPrice;
				}

				return sum;
			} finally {
				readlock.unlock();
			}
		}

		public void addItem(int price) {
			writeLock.lock();
			try {
				Integer numberOfItemsForPrice = priceToCountMap.get(price);
				if (numberOfItemsForPrice == null) {
					priceToCountMap.put(price, 1);
				} else {
					priceToCountMap.put(price, numberOfItemsForPrice + 1);
				}

			} finally {
				writeLock.unlock();
			}
		}

		public void removeItem(int price) {
			writeLock.lock();
			try {
				Integer numberOfItemsForPrice = priceToCountMap.get(price);
				if (numberOfItemsForPrice == null || numberOfItemsForPrice == 1) {
					priceToCountMap.remove(price);
				} else {
					priceToCountMap.put(price, numberOfItemsForPrice - 1);
				}
			} finally {
				writeLock.unlock();
			}
		}
	}

}
