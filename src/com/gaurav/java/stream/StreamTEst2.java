package com.gaurav.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTEst2 {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("Gaurav");
	list.add("haurav");
	list.add("aaurav");
	list.add("baurav");
	list.add("zaurav");
	
	List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedList);
	List<String> soretedListDesc = list.stream().sorted((str1,str2)->str2.compareTo(str1)).collect(Collectors.toList());
	System.out.println(soretedListDesc);
	
	list.forEach((str)->System.out.println(str));
	
	Stream<Integer> stream = Stream.of(2,2020002000);
	stream.forEach(System.out::print);
}
}
