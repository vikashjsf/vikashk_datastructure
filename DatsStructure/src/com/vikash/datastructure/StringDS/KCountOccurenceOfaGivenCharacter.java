//How to Count Occurrences of a given Character in String
package com.vikash.datastructure.StringDS;

import java.util.HashMap;

public class KCountOccurenceOfaGivenCharacter {
	public static void main(String[] args) {
		System.out.println(returnNoOfOccurenceOfCharacter("vikashKumar", 'm'));
		System.out.println(anotherApproach("vikash", 'k'));
	}
	
	public static int returnNoOfOccurenceOfCharacter(String str, char ch) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		if (map.containsKey(ch)) {
			return map.get(ch);
		} else {
			return -1;
		}
	}
	
	public static int anotherApproach(String str, char ch) {
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==ch) {
				++count;
			}
		}
		return count;
	}
	
}
