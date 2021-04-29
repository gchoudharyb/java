package com.gaurav.java.reflection;

import java.lang.reflect.AnnotatedArrayType;
import java.lang.reflect.AnnotatedType;

@Retryble(numOfRetires=0)
public class AnnotationTest {
public static void main(String[] args) {
	Class<AnnotationTest> class1 = AnnotationTest.class;
	AnnotatedType[] annotatedArrayTypes = class1.getAnnotatedInterfaces();
	for (AnnotatedType annotatedType : annotatedArrayTypes) {
		System.out.println(annotatedType.getAnnotations()[0]);
	}
}
}
