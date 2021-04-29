package com.gaurav.java.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetTest {
public static void main(String[] args) {
	Set<String> set = new HashSet<>();
	
	System.out.println(set.add("gaurav"));
	System.out.println(set.add("gaurav"));
	System.out.println(set.add("gaurav"));
	System.out.println(set.add("gaurav"));
	System.out.println(set.add("gaurav"));
	System.out.println(set.add("gaurav"));
	System.out.println(set.add("gaurav"));
	
SortedSet<Integer> integers = new TreeSet<>();
	integers.add(100);
	integers.add(1030);
	integers.add(10);
	integers.add(2100);
	integers.add(3100);integers.add(9100);
	integers.add(1100);
	integers.add(6100);
	System.out.println(integers.headSet(1100));
	System.out.println(integers.comparator());
}
}
