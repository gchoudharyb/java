package com.gaurav.java.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiPredicate;

public class BipredicateTEst {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("gaurav", 1);
		map.put("lalit", 3);
		map.put("rohit", 5);
		map.put("ganpati", 2);
		BiPredicate<String, Integer> biPredicate = (s, n) -> s.startsWith("g") && n == 1;
		map.forEach((key, value) ->

		{
			if (biPredicate.test(key, value)) {
				System.out.println(key + "::" + value);
			}

		});
	}
}
