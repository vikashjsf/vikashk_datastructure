//Write a program to print all permutations of a given string
package com.vikash.datastructure.StringDS;

public class OPermutationOfString {
	public static void main(String args[]) {
		permutation(0, "ABC");
	}

	private static void permutation(int start, String str) {
		 char [] ch =  str.toCharArray();
		 if(start==ch.length)
			 System.out.println(str);
		 else
			 for (int i = start; i < ch.length; i++) {
				char c = ch[start];
				ch[start]=ch[i];
				ch[i]=c;
				permutation(start+1, new String(ch));
			}
	}
}
