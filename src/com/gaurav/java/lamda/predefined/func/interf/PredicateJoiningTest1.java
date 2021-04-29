package com.gaurav.java.lamda.predefined.func.interf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class PredicateJoiningTest1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Kushagara");
		list.add("gaurav");
		list.add("Karav");
		list.add("Karan");
		Predicate<String> predicate = (s) -> {
			char firstChar = s.charAt(0);
			if (firstChar == 'k' || firstChar == 'K') {
				return true;
			} else {
				return false;
			}
		};
		checkName(predicate, list);

	}

	public static void checkName(Predicate<String> predicate, List<String> s) {
		for (String string : s) {
			if (predicate.test(string)) {
				System.out.println(string);
			}
		}
	}
}
