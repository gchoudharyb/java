package com.gaurav.java.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class EnumerationTest {
public static void main(String[] args) {
	Stack<Integer> integers = new Stack<>();
	integers.push(50);
	integers.push(51);
	System.out.println(integers);
	System.out.println(integers.peek());
	System.out.println(integers);
	Enumeration<Integer> enumeration = integers.elements();
	while (enumeration.hasMoreElements()) {
		Integer integer = (Integer) enumeration.nextElement();
		System.out.println(integer);
		
	}
	
	ListIterator<Integer> iterator = integers.listIterator();
	while (iterator.hasNext()) {
		Integer integer = (Integer) iterator.next();
		
	}
	Iterator<Integer> iterator2 = integers.iterator();
	while (iterator2.hasNext()) {
		Integer integer = (Integer) iterator2.next();
		
	}
	
	List<Integer> integers2 = new ArrayList<>();
	integers2.add(20);
	integers2.add(20);
	for (Integer integer : integers2) {
	}
	System.out.println(integers2);
	ListIterator<Integer> iistIterator = integers2.listIterator();
	while (iistIterator.hasNext()) {
		Integer integer = (Integer) iistIterator.next();
		iistIterator.remove();;
	}
	System.out.println(integers2);
	
	System.out.println(iistIterator.getClass().getName());
	System.out.println(iterator2.getClass().getName());
	System.out.println(enumeration.getClass().getName());
	
	Set<String> set = new HashSet<>();
	set.spliterator();
	Map<String, String> map = new HashMap<String, String>();
}
}
