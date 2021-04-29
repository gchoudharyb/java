package com.gaurav.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UniqueElementsList {
public static void main(String[] args) {
	List<Integer> integers = Arrays.asList(1,5,2,1,9,8,8,9,6,3,5,2,1,4,5,6,4);
	
	/**
	 * Imperative approach
	 */
	
	List<Integer> uniqueList = new ArrayList<Integer>();
	
	
	for (Integer integer : integers) {
		if(!uniqueList.contains(integer))
		{
			uniqueList.add(integer);
		}
		
	}
	System.out.println(uniqueList);
	List<Integer> uniqueListUsingDecla = null;;
	
	/**
	 * Declarative aproach
	 */
	uniqueListUsingDecla=	integers.stream().distinct().collect(Collectors.toList());
	System.out.println(uniqueListUsingDecla);
}
}
