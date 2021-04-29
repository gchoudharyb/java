package com.gaurav.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest1 {
public static void main(String[] args) {
	Pattern p = Pattern.compile("ab");
	Matcher matcher = p.matcher("abaaababaxcabab");
	int count=0;
	while (matcher.find()) {
		count++;
		System.out.println("start index...."+matcher.start()+"...end index"+matcher.end()+"....group"+matcher.group());
		
	}
	System.out.println("Total occurece of ab::"+count);
}
}
