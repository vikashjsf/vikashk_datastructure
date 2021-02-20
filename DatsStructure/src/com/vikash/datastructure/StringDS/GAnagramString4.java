//Check whether two strings are anagram of each other - Using java -Arrays.equal(-,-).
package com.vikash.datastructure.StringDS;

import java.util.Arrays;

public class GAnagramString4 {
	public static void main(String[] args) {
		String str1 = "geeksforgeeks", str2 = "forgeeksgeeks";
		if(checkAnagramString(str1, str2)) 
			System.out.println("The two strings are" + "anagram of each other");
		else
			System.out.println("The two strings are not" + " anagram of each other");
	}
	
	public static boolean checkAnagramString(String str1, String str2) {
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);
	}
}
