package com.gaurav.java.lamda.predefined.func.interf;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateJoiningTest2 {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Kushagara");
		list.add("");
		list.add("Karav");
		list.add(null);
		Predicate<String> predicate = (s) -> {
			if (s==null || s.isEmpty()) {
				return true;
			} else {
				return false;
			}
		};
		System.out.println(removeEmptyOrNull(predicate.negate(), list));
	
	}
	
	public static List<String>  removeEmptyOrNull(Predicate<String> predicate, List<String> s) {
		List<String> modifiedList = new ArrayList<>();
		for (String string : s) {
			if (predicate.test(string)) {
				modifiedList.add(string);
			}
		}
		return modifiedList;
	}
	
}

