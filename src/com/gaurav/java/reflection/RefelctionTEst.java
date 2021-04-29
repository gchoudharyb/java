package com.gaurav.java.reflection;

import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.Map;

public class RefelctionTEst {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<Integer> class1 = Integer.class;

		System.out.println(class1.getCanonicalName());
		Class<Integer> class3 = int.class;
		System.out.println(class3);

		Class<?> class2 = String.class;
		System.out.println(class2.getDeclaredConstructors());

		Class<String> class4 = (Class<String>) Class.forName("java.lang.String");
		printclassInformation(class4);
		Class<?> class5 = Class.forName("com.gaurav.java.thread.concurrent.CallableThread");
		printclassInformation(class5);

	}

	static void printclassInformation(Class<?>... classes) {
			for (Class<?> class1 : classes) {
				System.out.println(class1.getName()+"::"+class1.getCanonicalName()+"::"+class1.getModifiers()+"::"+class1.getSimpleName()+"::"+class1.getTypeName());
				Constructor<?> [] constructor = class1.getConstructors();
				for (Constructor<?> class2 : constructor) {
					System.out.println(class2.getName() + "::"+class2.getParameterCount());
				}
				Class<?> [] inf = class1.getInterfaces();
				for (Class<?> class2 : inf) {
					System.out.println(class2.getSimpleName());
				}
				
			}
	}
}
