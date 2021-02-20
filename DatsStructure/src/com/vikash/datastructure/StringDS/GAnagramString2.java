//Check whether two strings are anagram of each other
package com.vikash.datastructure.StringDS;

import java.util.Arrays;

public class GAnagramString2 {
	public static void main(String[] args) {
		boolean status = modifiedAboveApproach("TRIANGLE", "INTEGRAL");
		System.out.println(status == true ? "Anagram Number" : "Not Anagram");
	}

	public static boolean modifiedAboveApproach(String first, String second) {
		char[] str1;
		char[] str2;
		if (first.length() != second.length())
			return false;
		else {
			str1 = first.toCharArray();
			str2 = second.toCharArray();
		}
		Arrays.sort(str1);
		Arrays.sort(str2);
		for (int i = 0; i < str2.length; i++) {
			if (str1[i] != str2[i])
				return false;
		}
		return true;
	}

}
