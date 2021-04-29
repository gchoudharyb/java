package com.gaurav.java.regex;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileRegexTest {
	public static void main(String[] args) {
		/*Pattern p = Pattern.compile("[7-9][0-9]{9}");
		Matcher matcher = p.matcher("9899557036");
		int count=0;
		while (matcher.find()) {
			count++;
			System.out.println("start index...."+matcher.start()+"...end index"+matcher.end()+"....group"+matcher.group());
			
		}
		System.out.println("Total occurece of ::"+count);*/
		
		String mobNo = "0989955703609899557036";
		Pattern pattern = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		Matcher matcher2 = pattern.matcher(mobNo);
		if(matcher2.find() && matcher2.group().equalsIgnoreCase(mobNo))
		{
			System.out.println("Valid");
		}
		else
		{System.out.println(matcher2.group());
			System.out.println("Invalid");
		}
}
}