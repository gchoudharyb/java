package com.gaurav.java.string;

class GFG {

	// Function to remove spaces and convert
	// into camel case
	static String convert(String s) {

		// to count spaces
		int count = 0;
		int stringLength = s.length();
		char ch[] = s.toCharArray();
		int res_ind = 0;

		for (int i = 0; i < stringLength; i++) {

			// check for spaces in the sentence
			if (ch[i] == ' ') {
				count++;
				// conversion into upper case
				ch[i + 1] = Character.toUpperCase(ch[i + 1]);
				continue;
			}

			// If not space, copy character
			else
				ch[res_ind++] = ch[i];
		}

		// new string will be resuced by the
		// size of spaces in the original string
		return String.valueOf(ch, 0, stringLength - count);
	}

	// Driver code
	public static void main(String args[]) {
		String str = "I get intern at geeksforgeeks";
		System.out.println(convert(str));
		System.out.println(convertCPlus("helloJavaEight"));
	}
	
	static String convertCPlus(String s) {

		//helloJavaEight // hello_java_eight
		
		char c[] = s.toCharArray();
		String result="";
		
		for (int i = 0; i < c.length; i++) {
			
			int code = c[i];
			
			if(code>=65 && code<=90)
			{
				result=result+"_"+Character.toLowerCase(c[i]);
				c[i-1] = '_';
			}
			else
			{
				result = result+c[i];
			}
		}
		
		return result;
	}
}

// This code is contributed by gp6. 