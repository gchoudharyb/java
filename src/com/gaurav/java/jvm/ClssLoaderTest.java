package com.gaurav.java.jvm;

import javax.xml.crypto.Data;

import com.gaurav.java.collection.MapSizeTest;

public class ClssLoaderTest {
public static void main(String[] args) {
	System.out.println(ClssLoaderTest.class.getClassLoader());
	System.out.println(String.class.getClassLoader());
	System.out.println(Data.class.getClassLoader());
	System.out.println(MapSizeTest.class.getClassLoader());
}
}
