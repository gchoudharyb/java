package com.gaurav.java.collection;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {
public static void main(String[] args) {
	Map<String, Integer> map = new ConcurrentHashMap<>();
	map.put("gauracv", 1);
	map.putIfAbsent("gaurav", 2);
	map.put("tejas", 1);
	map.remove("gaurav", 100);
	map.replace("gaurav", 200, 20);
	System.out.println(map);
}
}
