package com.gaurav.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import javax.print.DocFlavor.STRING;

public class PredicateTest {
	public static void main(String[] args) {
		Predicate<Integer> predicate1 = (num) -> num % 2 == 0;
		Predicate<Integer> predicate2 = (num) -> num % 3 == 0;
		System.out.println(predicate1.or(predicate2).test(20));
		System.out.println(predicate1.and(predicate2).test(20));
		System.out.println(predicate1.and(predicate2).test(30));
		System.out.println(predicate1.and(predicate2).negate().test(30));

		List<String> list = new ArrayList<String>();
		list.add("gaurav");
		list.add("lalit");
		list.add("rohit");

		Predicate<String> predicate = (s) -> s.startsWith("g");

		list.forEach((l) -> {
			if (predicate.test(l)) {
				System.out.println(l);
			}
		})

		;
	}
}
