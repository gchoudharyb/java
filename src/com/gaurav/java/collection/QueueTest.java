package com.gaurav.java.collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

import javax.swing.text.html.HTMLDocument.Iterator;

public class QueueTest {
public static void main(String[] args) {
	Queue<String> queue = new ArrayDeque<>();
	queue.offer("gaurav1");
	queue.offer("gaurav2");
	queue.offer("gaurav3");
	queue.offer("gaurav4");
	queue.offer("gaurav5");
	queue.offer("gaurav6");
	queue.offer("gaurav7");
	queue.offer("gaurav8");
	queue.offer("gaurav9");
	
	
	System.out.println(queue);
	System.out.println(queue.peek());
	System.out.println(queue.poll());
	System.out.println(queue.remove());
	//System.out.println(queue.he);
	
	List<String> list = new ArrayList<String>();
	String [] strArr = {"as","as"};
	List<String> list2 = Arrays.asList(strArr);
	//list2.add("dddd");
	
	List<String> list3 = new ArrayList<>();
	list3.add("g1");
	list3.add("sss");
	java.util.Iterator<String> iterator = list3.iterator();
	while(iterator.hasNext())
	{
		list3.add("zzz");
	}
	
	/*
	for (String string : list3) {
		list3.add("xx");
	}*/
	System.out.println(list3);
	
}
}
