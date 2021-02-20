//How to count Vowels and Consonants in Java String Word

package com.vikash.datastructure.StringDS;

import java.util.regex.Pattern;

public class CCountNoOfVowelsConsonants {
	public static void main(String[] args) {
		countNoOfVowelsConsonant("How many vowels in this String");
		countNoOfVowelsConsonant("AEioU");
		System.out.println("**********************");
		usingPatternMatcher("How many vowels in this String");
		usingPatternMatcher("AEioU");
	}
	
	public static void countNoOfVowelsConsonant(String str) {
		int vCount=0, cCount=0;
		for (char ch : str.toLowerCase().toCharArray()) {
			if(ch!=' ') {
				switch (ch) {
				case 'a':
					vCount++;
					break;
				case 'e':
					vCount++;
					break;
				case 'i':
					vCount++;
					break;
				case 'o':
					vCount++;
					break;
				case 'u':
					vCount++;
					break;
				default:
					cCount++;
					break;
				}
			}
		}
		System.out.println("Total Vowels :"+vCount +" Total Consonant Count :"+cCount);
	}
	
	public static void usingPatternMatcher(String str) {
		int vCount=0, cCount=0;
		for (char ch : str.toLowerCase().toCharArray()) {
			if(ch!=' ') {
				if(Pattern.matches("[aeiou]", Character.toString(ch)))
					vCount++;
				else
					cCount++;
			}
		}
		System.out.println("Total Vowels :"+vCount +" Total Consonant Count :"+cCount);
	}
}
