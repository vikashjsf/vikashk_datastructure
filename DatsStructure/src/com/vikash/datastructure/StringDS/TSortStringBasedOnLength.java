//How to sort String/Arrays of String on their length in Java
package com.vikash.datastructure.StringDS;

import java.util.Arrays;
import java.util.Comparator;

public class TSortStringBasedOnLength {
	public static void main(String[] args) {
		String[] words = {"abc", "xy", "aaaa","d","a","am","ami","vikash","kumar"};
		System.out.println("Given Arrays : "+Arrays.toString(words));
		Arrays.sort(words, new SortStringBasedOnLength());
		System.out.println("Result Arrays :"+Arrays.toString(words));
	}
}


class SortStringBasedOnLength implements Comparator<String>{
	@Override
	public int compare(String first, String second) {
		return first.length()-second.length();
	}
	
	/*// for Descending order
	@Override
	public int compare(String first, String second) {
		return second.length()-first.length();
	}*/
}