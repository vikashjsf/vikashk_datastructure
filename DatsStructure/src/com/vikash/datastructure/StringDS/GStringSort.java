package com.vikash.datastructure.StringDS;

public class GStringSort {
	public static void main(String[] args) {
		String str = "gfedcba";
		sortStirng(str.toLowerCase().toCharArray());
	}
	
	public static void sortStirng(char[] charArray) {
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[j] < charArray[i]) {
					swapChars(i, j, charArray);
				}
			}
		}
		System.out.println("Sorted string " + String.valueOf(charArray));
	}
	
	
    private static void swapChars(int i, int j, char[] charArray) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }
}
