//Reverse words in a given string
package com.vikash.datastructure.StringDS;

public class DReverseWord {
	public static void main(String[] args) {
		String str ="i like this program very much";
		System.out.println(str);
		myApproach1(str);
		//or
		//StringBuffer sb = new StringBuffer(str).reverse();
		//System.out.println("Revese : "+sb);
		//output : Reverse : much very program this like i 
	}
	
	public static void myApproach1(String str) {
		//i like this program very much
		//output : much very program this like i
		String[] word = str.split("\\s");
		String output = "";
		for (int i = word.length-1; i >= 0; i--) {
			output+=word[i]+" ";
		}
		System.out.println(output);
	}
}
