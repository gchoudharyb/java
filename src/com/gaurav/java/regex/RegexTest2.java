package com.gaurav.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest2 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[^abc]");
		Matcher matcher = p.matcher("abaaababaxcabab");
		int count=0;
		while (matcher.find()) {
			count++;
			System.out.println("start index...."+matcher.start()+"...end index"+matcher.end()+"....group"+matcher.group());
			
		}
		System.out.println("Total occurece of ab::"+count);
		
		Pattern p1 = Pattern.compile("a?");
		Matcher matcher1 = p1.matcher(" abaa@ababax_cabab");
		int count1=0;
		while (matcher1.find()) {
			count1++;
			System.out.println("start index...."+matcher1.start()+"...end index"+matcher1.end()+"....group"+matcher1.group());
			
		}
		System.out.println("Total occurece of ab::"+count1);
	}
}
