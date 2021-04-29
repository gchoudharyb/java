package com.gaurav.java.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapSet {
public static void main(String[] args) {
	Map<Integer, String> map = new  HashMap<Integer, String>();
	System.out.println(map.put(10, "gaurav"));
	System.out.println(map.put(10, "Durga"));
	System.out.println(map.put(11, "gaurav1"));
	
	System.out.println(map.entrySet());
	System.out.println(map.values());
	List<String> list = new ArrayList<String>(map.values());
	System.out.println(list);
	
for (Map.Entry<Integer, String> m : map.entrySet()) {
	System.out.println(m.getKey());
	System.out.println(m.getValue());
}
}
}
