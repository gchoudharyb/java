package com.gaurav.java.stream;

import java.util.Arrays;
import java.util.List;

public class ReduceTest {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 3, 0, 5);
		Integer result = integers.stream().reduce(1, (i1, i2) -> i1 * i2);

		System.out.println(result);

		Integer result1 = integers.stream().peek((i) -> System.out.println("Peek::" + i)).reduce(1,
				(i1, i2) -> i1 > i2 ? 11 : i2);
		System.out.println(result1);

		List<Integer> integerss = Arrays.asList(1000, 3, 20, 150);
		Integer result2 = integerss.stream().reduce(1, Integer::max);
		System.out.println("_____________________________________________________________________________");
		System.out.println(result2);

		int res = integerss.stream().reduce(1, Math::multiplyExact);
		int res1 = integerss.stream().reduce(1, (a, b) -> a * b);
		System.out.println(res);

		int res2 = integerss.stream().reduce(1, (a, b) -> {
			System.out.println(a);
			System.out.println(b);
			return a > b ? a : b;
		});
		System.out.println(res2);

	}
}
