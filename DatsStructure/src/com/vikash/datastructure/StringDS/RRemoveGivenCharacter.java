//How to Remove Given Character from String in Java.
package com.vikash.datastructure.StringDS;

public class RRemoveGivenCharacter {
	public static void main(String[] args) {
		String str = "Remove Given Character from String in Java";
		char ch ='a';
		System.out.println(remvoeCharacter(str.toLowerCase(), ch));
		System.out.println(remCharUsingRecursion(str.toLowerCase(),ch));
	}
	
	public static String remvoeCharacter(String str,char ch) {
		String result="";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
			}else {
				result=result+str.charAt(i);
			}
		}
		return result;
	}
	
	public static String remCharUsingRecursion(String str,char ch) {
		int index = str.indexOf(ch);
		if(index==-1) {
			return str;
		}
		return remCharUsingRecursion(str.substring(0, index) 
				+ str.substring(index + 1, str.length()), ch);
	}
}
