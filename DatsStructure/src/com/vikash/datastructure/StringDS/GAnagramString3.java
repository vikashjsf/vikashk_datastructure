//Check whether two strings are anagram of each other- Method 2 (Count characters)
package com.vikash.datastructure.StringDS;

import java.util.Arrays;

public class GAnagramString3 {
	static int SIZE = 256;

	public static void main(String args[]) {
		String str1 = "geeksforgeeks", str2 = "forgeeksgeeks";
		if (checkAnagramUsingCountCharacter(str1, str2))
			System.out.println("The two strings are" + "anagram of each other");
		else
			System.out.println("The two strings are not" + " anagram of each other");
	}
	
	public static boolean checkAnagramUsingCountCharacter(String str1,String str2) {
		if(str1.length()!=str2.length())
			return false;
		int [] strCount1 = new int [SIZE];
		int [] strCount2 = new int [SIZE];
		
		for (int i = 0; i < str1.length() && i < str2.length(); i++) {
			strCount1[str1.charAt(i)]++;
			strCount2[str2.charAt(i)]++;
		}
	
		
		for (int i = 0; i < SIZE; i++) {
			if(strCount1[i]!=strCount2[i])
				return false;
		}
		return true;
	}
}

/*
This method assumes that the set of possible characters in both strings is small. 
	In the following implementation, it is assumed that the characters 
	are stored using 8 bit and there can be 256 possible characters.
1) Create count arrays of size 256 for both strings. Initialize all values in count arrays as 0.
2) Iterate through every character of both strings and increment the count of 
	character in the corresponding count arrays.
3) Compare count arrays. If both count arrays are same, then return true.
*/
