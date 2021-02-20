package com.vikash.datastructure.StringDS;

public class IReveseString {
	public static void main(String[] args) {
		String str = "Sony is going to introduce Internet TV soon";
		/*System.out.println(myApproach1(str));
		System.out.println(myApproach2(str));
		System.out.println(myApproach3(str));*/
		System.out.println(reverseRecursively(str));
		//System.out.println(reverse(str));
	}
	
	//Using StringBuffer
	public static String myApproach1(String str) {
		StringBuffer sb = new StringBuffer(str);
		return sb.reverse().toString();
	}
	
	//Reverse character wise
	public static String myApproach2(String str) {
		char [] ch = str.toCharArray();
		String reverse = "";

		for (int i = ch.length - 1; i >= 0; i--) {
			char c = ch[i];
			reverse =reverse+Character.toString(c);
		}
		return reverse;
	}
	//Reverse character wise
	public static String myApproach3(String str) {
		String reverse = "";
		for (int i = str.length()-1; i >= 0; i--) {
			reverse =reverse+Character.toString(str.charAt(i));
		}
		return reverse;
	}
	
	// using Recursion
	public static String reverseRecursively(String str) {
		// base case to handle one char string and empty string
		System.out.println("str:"+str + "|length : "+str.length());
		if (str.length() == 0) {
			return str;
		}
		return reverseRecursively(str.substring(1)) + str.charAt(0);

	}
	
	//Using StringBuilder class
	public static String reverse(String str) {
		StringBuilder strBuilder = new StringBuilder();
		char[] strChars = str.toCharArray();
		for (int i = strChars.length - 1; i >= 0; i--) {
			strBuilder.append(strChars[i]);
		}
		return strBuilder.toString();
	}

}
