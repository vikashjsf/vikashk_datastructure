//Java program to swap first and last characters of words in a sentence
package com.vikash.datastructure.StringDS;

public class MSwapFirstAndLastCharacter {
	public static void main(String[] args) {
		 String str = "first and last characters of words in aa sentence";
		 System.out.println(str);
		 System.out.println(myApproach(str));
		 System.out.println(anotherApproach(str));
	}
	
	public static String myApproach(String str) {
		String[] word = str.split("\\s");
		String result = "";
		char[] ch = null;
		for (String st : word) {
			ch = st.toCharArray();
			char c = ch[0];
			ch[0] = ch[ch.length - 1];
			ch[ch.length - 1] = c;
			result = result + String.valueOf(ch) + " ";
		}
		return result;
	}
	
	public static String anotherApproach(String str) {
		char[] ch = str.toCharArray();
		int k;
		for (int i = 0; i < ch.length; i++) {
			k=i;
			while(i< ch.length && ch[i]!=' ')
				++i;
			char c = ch[k];
			ch[k]=ch[i-1];
			ch[i-1]=c;
		}
		return new String(ch);
	}
}
