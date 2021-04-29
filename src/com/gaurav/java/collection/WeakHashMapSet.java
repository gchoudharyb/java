package com.gaurav.java.collection;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapSet {
	public static void main(String[] args) throws InterruptedException {
		HashMap<Student, String> hashMap = new HashMap<>();
		Student student = new Student(10, "gaurav");
		hashMap.put(student, "gaurav");
		student = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(hashMap);
		
		WeakHashMap<Student, String> weakHashMap = new WeakHashMap<>();
		Student student1 = new Student(10, "gaurav");
		weakHashMap.put(student1, "gaurav");
		student1 = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(weakHashMap);
	}
}
