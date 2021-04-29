package com.gaurav.java.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapSizeTest {
public static void main(String[] args) {
	String s = "FB";
	String s1 = "Ea";
	Map<String, Integer> map = new HashMap<String, Integer>();
	map.put(s, 1);
	map.put(s1, 1);
	map.put("FA", 1);
	map.put("Eb", 1);
	map.put("GA", 1);
	map.put("xx", 1);
	map.put("yy", 1);
	map.put("Yb", 1);
	map.put("ZX", 1);
	map.put("ca", 1);
	map.put("ff", 1);
	map.put("ff", 1);
	map.put("ff", 1);
	System.out.println(s.hashCode()==s1.hashCode());
	
	Hashtable<String, Integer> map1 = new Hashtable<String, Integer>();
	map1.put(s, 1);
	map1.put(s1, 1);
	map1.put("FA", 1);
	map1.put("Eb", 1);
	map1.put("GA", 1);
	map1.put("xx", 1);
	map1.put("yy", 1);
	map1.put("Yb", 1);
	map1.put("ZX", 1);
	map1.put("ca", 1);
}
}
