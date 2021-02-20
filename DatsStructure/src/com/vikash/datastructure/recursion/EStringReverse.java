package com.vikash.datastructure.recursion;

public class EStringReverse {

	public static void main(String[] args) {
		String str = "Karnataka Bangalore";
		String reverse = reverse(str);
		System.out.println("Reverse :" + reverse);
	}

	public static String reverse(String sentence) {
		if (sentence.isEmpty())
			return sentence;
		return reverse(sentence.substring(1)) + sentence.charAt(0);
	}
}

//Reverse a given sentence using a recursive loop in Java.