package com.gaurav.java.regex;

import java.util.StringTokenizer;

public class StringTokeizerTest {
public static void main(String[] args) {
	StringTokenizer stringTokenizer = new StringTokenizer("gaurav Kumar Choudhary");
	while(stringTokenizer.hasMoreTokens())
	{
		System.out.println(stringTokenizer.nextToken());
	}
	
	StringTokenizer stringTokenizer2 = new StringTokenizer("13-10-2020","-");
	while (stringTokenizer2.hasMoreElements()) {
		System.out.println(stringTokenizer2.nextToken());
		
	}
}
}
