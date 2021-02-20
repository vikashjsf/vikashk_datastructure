package com.vikash.datastructure.StringDS;

public class SHighestOccurCharacter {
	public static void main(String[] args) {
		String str = "ttttuuu";
		System.out.println(getMaxOccuringChar(str));
	}
	
	static char getMaxOccuringChar(String str) {
		int [] count = new int[256];
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}
		int max=0;
		char result=' ';
		for (int i = 0; i < str.length(); i++) {
			int x = count[str.charAt(i)];
			//System.out.println(str.charAt(i)+" : "+count[str.charAt(i)]);
			if (x > max) {
				max = x;
				result=str.charAt(i);
			}
		}
		return result;
    } 
}
