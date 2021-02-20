package com.vikash.datastructure.recursion;
//program to calculate the nth numbe of the fibonacci series
public class FibonacciNumber {
	public static void main(String[] args) {
		int n = 7;
		int fibo = calculateFibonacci(n);
		System.out.println("Fibonacci Number is::" + fibo);
	}

	public static int calculateFibonacci(int n) {
		if (n == 1 || n == 0) {
			return 1;
		} else {
			int fibo = calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
			return fibo;
		}
	}
}

//0 1 -------- 1 2 3 5 8 13 21 34