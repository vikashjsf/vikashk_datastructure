package com.vikash.datastructure.StringDS;

public class LPalindromCheck {
	public static void main(String[] args) {
		String[] str1 = { "Annaq", "Civic", "Kayak", "Level", 
				"Madam", "Mom", "Noon", "Racecar", "Radar" };
		for (String word : str1) {
			if(word.equalsIgnoreCase(reveseString(word))) {
				System.out.println(word + " is palindrome");
			}else {
				System.out.println(word + " Palindrome not found");
			}
		}
	}
	
	public static String reveseString(String str) {
		if(str.length()==0) {
			return str;
		}
		return reveseString(str.substring(1))+str.charAt(0);
	}
}
