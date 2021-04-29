package com.gaurav.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ConcurrentModificationTest {
	static List<String> list = new ArrayList<String>();
	public static void main(String[] args) {
		list.add("gaurav");
		list.add("1gaurav");
		list.add("ga1urav");
		list.add("ga1urav");
		list.add("gau1rav");
		/*
		 * for (String string : list) { list.remove(0); }
		 */
		//Thread thread = new Thread(() -> list.add("gaurav"));
		//thread.start();

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {

			System.out.println(iterator.next());
			//iterator.remove();
		}
		System.out.println(list);
		
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {

			System.out.println(listIterator.next());
			listIterator.remove();
			listIterator.add("you");
		}
		System.out.println(list);
	}
}
