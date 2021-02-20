//Swap corner words and reverse middle characters
package com.vikash.datastructure.StringDS;

public class NSwapCornerWord {
	public static void main(String[] args) {
		String str = "Hello World GFG Welcomes You";
		System.out.println(str);
		System.out.println(reverse(str));
	}

	public static String reverse(String str) {
		String first = "", last = "";
		int m = 0;
		int n = 0;
		// For getting the first string
		for (int i = 0; i < str.length();) {
			while (str.charAt(i) != ' ') {
				first = first + str.charAt(i);
				i++;
			}
			m = i;
			break;
		}
		// System.out.println("First:"+first);
		// For getting the last string
		for (int j = str.length() - 1; j > m;) {
			while (str.charAt(j) != ' ') {
				last = str.charAt(j) + last;
				j--;
			}
			n = j;
			break;
		}
		String result = "";
		for (int i = n; i > m; i--) {
			result = result + str.charAt(i);
		}
		result = last + " " + result + " " + first;
		return result;
	}

}
