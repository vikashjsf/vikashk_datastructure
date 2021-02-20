package com.vikash.datastructure.StringDS;

import java.util.Arrays;

public class EReverseWords {

	public static void main(String[] args) {
		char[] str = "Vikash kumar".toCharArray();
		getReverse(str);
		System.out.println("After "+Arrays.toString(str));
	}

	public static void getReverse(char[] str) {
		int n = str.length;
		int start = 0;
		System.out.println("Before"+Arrays.toString(str));
		for (int i = 0; i < n; i++) {
			if (str[i] == ' ' && i > 0) {
				reverse(str, start, i - 1);
				start = i + 1;
			} else if (i == n - 1) {
				reverse(str, start, i);
			}
		}
		reverse(str, 0, n - 1);
	}

	private static void reverse(char[] str, int start, int end) {
		while (start < end) {
			swap(str, start, end);
			start++;
			end--;
		}
	}

	private static void swap(char[] str, int start, int end) {
		char tmp = str[start];
		str[start] = str[end];
		str[end] = tmp;
	}
}
