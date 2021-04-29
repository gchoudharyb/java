package com.gaurav.java.reflection;

import java.util.HashSet;
import java.util.Set;

public class CheckInterfaces {
public static void main(String[] args) {
	Class<HashSet> class1 = HashSet.class;
	Class<?> [] interfaces = class1.getInterfaces();
	Class<?> [] classes = class1.getClasses();
	for (int i = 0; i < interfaces.length; i++) {
		System.out.println(class1.getSimpleName()+"::"+interfaces[i].getCanonicalName());
	}
	for (Class<?> class2 : classes) {
		System.out.println(class2.getSimpleName()+"::"+class2.getCanonicalName());
	}
	
}
}
