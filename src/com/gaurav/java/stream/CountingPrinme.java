package com.gaurav.java.stream;

import java.util.stream.IntStream;


public class CountingPrinme {
	public static void main(String[] args) {
		long startMs1 = System.currentTimeMillis();

		System.out.println(IntStream.rangeClosed(2, Integer.MAX_VALUE/100).filter(CountingPrinme::isPrime).count());

		long endMs1 = System.currentTimeMillis();

		long diff1 = endMs1 - startMs1;
		System.out.println("Time Elasped::"+diff1);
		long startMs = System.currentTimeMillis();
		System.out.println(IntStream.rangeClosed(2, Integer.MAX_VALUE/100).parallel().filter(CountingPrinme::isPrime).count());

		long endMs = System.currentTimeMillis();
		
		long diff = endMs - startMs;
		System.out.println("Time Elasped::"+diff);

	}

	private static boolean isPrime(int num) {
		if (num > 1 && num % 2 == 0)
			return false;
		if (num == 2)
			return true;
		long maxDivisor = (long) Math.sqrt(num);
		for (int i = 3; i < maxDivisor; i += 2) {
			if (num % i == 0) {
				return false;
			}

		}
		return true;
	}
}
