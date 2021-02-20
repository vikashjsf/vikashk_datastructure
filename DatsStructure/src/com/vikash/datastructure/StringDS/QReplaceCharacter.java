//How to replace each given character to other e.g. blank with %20?
package com.vikash.datastructure.StringDS;

import java.util.Arrays;

public class QReplaceCharacter {
	public static void main(String[] args) {
		String str = "Java is Great   ";
		String repString="%20";
		System.out.println(replaceCharacter1(str.trim(), repString));
		System.out.println(replaceCharacter2(str.trim(), repString));
		System.out.println(replaceCharacter3(str.trim(), repString));
	}
	
	public static String replaceCharacter1(String str,String repString) {
		String[] word = str.split(" ");
		System.out.println(Arrays.toString(word));
		String resResult ="";
		for (int i = 0; i < word.length-1; i++) {
			resResult=resResult+word[i]+repString;
		}
		return resResult+word[word.length-1];
	}
	
	private static String replaceCharacter2(String str, String repString) {
		char[] ch = str.toCharArray();
		String resString="";
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]==' ') {
				resString= resString+repString;
			}else {
				resString = resString+Character.toString(ch[i]);
			}
		}
		return resString;
	}
	
	private static String replaceCharacter3(String str, String repString) {
		 
		return str.replaceAll(" ", repString);
	}
}
