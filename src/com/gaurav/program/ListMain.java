package com.gaurav.program;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListMain {
public static void main(String[] args) {
	List<Integer> integers = new ArrayList<Integer>();
	integers.add(5);//5,4,3,5,5,4,3,2,2,2,9
	integers.add(4);
	integers.add(3);
	integers.add(5);
	integers.add(5);
	integers.add(4);
	integers.add(3);
	integers.add(2);
	integers.add(2);
	integers.add(2);
	integers.add(9);
	
	Set<Integer> set = new LinkedHashSet<>(integers);
	System.out.println(set);
	
}
}
