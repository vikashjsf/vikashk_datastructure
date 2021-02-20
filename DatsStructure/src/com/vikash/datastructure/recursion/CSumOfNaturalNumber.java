package com.vikash.datastructure.recursion;

public class CSumOfNaturalNumber {
	public static void main(String[] args) {
		int n =5;
		int sum = sumOfNaturalNumber(n);
		System.out.println("Sum of first " + n + " number is: " + sum);
	}
	
	public static int sumOfNaturalNumber(int n) {
		System.out.println("n: " + n);
		if (n == 1) {
			return 1;
		}else {
			int y = sumOfNaturalNumber(n - 1);
			int sum = n + y;
			System.out.println("n::" + n + " + " + y + " = " + sum);
			return sum;
		}
	}
}

// Sum of n given nuatural number using recursion.