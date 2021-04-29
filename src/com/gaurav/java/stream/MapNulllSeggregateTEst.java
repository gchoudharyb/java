package com.gaurav.java.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapNulllSeggregateTEst {
public static void main(String[] args) {
	Map<String, String> map = new HashMap<>();
	map.put("gaurav", "10000");
	map.put("kumar1", null);
	map.put("kumar2", null);
	//map.put("kumar3", null);
	//map.put("kumar4", null);
	
	/*for (Map.Entry entry : map.entrySet()) {
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}*/
	
	
	
	Map<String, String> map2 =map.entrySet().stream().peek(System.out::println).filter((s)->s.getValue()==null).peek(System.out::println).collect(Collectors.toMap((e)->e.getKey(), (e)->e.getValue()));
	System.out.println(map2);
	Map<String, String> map3 =map.entrySet().stream().peek(System.out::println).filter((s)->s.getValue()==null).collect(Collectors.toMap((m,v)->m.put(v.getKey(), v.getValue()), HashMap::putAll));
}
}
