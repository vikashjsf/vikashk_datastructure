//Check whether two strings are anagram of each other
/*
 An anagram of a string is another string that contains same characters, 
 	only the order of characters can be different. 
 	For example, “abcd” and “dabc” are anagram of each other
*/
package com.vikash.datastructure.StringDS;

import java.util.Arrays;

public class GAnagramString1 {
	public static void main(String[] args) {
		myApproach("LISTEN", "SILENT");
		myApproach("TRIANGLE", "INTEGRAL");
	}

	public static void myApproach(String first, String second) {
		char[] str1;
		char[] str2;
		if (first.length() == second.length()) {
			str1 = first.toCharArray();
			str2 = second.toCharArray();
			Arrays.sort(str1);
			Arrays.sort(str2);
			int count = 0;
			for (int i = 0; i < str2.length; i++) {
				if (str1[i] == str2[i])
					++count;
			}
			if (count == str1.length)
				System.out.println("Anagram Number");
		} else
			System.out.println("Not Anagram");
	}
}
/*

An anagram of a string is another string that contains same characters, only the order of characters 
can be different. For example, “abcd” and “dabc” are anagram of each other.
*/