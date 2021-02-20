//Program to generate the table of given number using recursion
package com.vikash.datastructure.recursion;

public class HGenerateTable {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= 10; i++) {
			int mul = table(5, i);
			System.out.println(n + " * " + i + " = " + mul);
		}
	}

	public static int table(int base, int i) {
		if (i == 1) {
			return base;
		} else {
			int val = base + table(base, i - 1);
			return val;
		}
	}
}
