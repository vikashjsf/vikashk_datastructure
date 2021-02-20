package com.vikash.datastructure.recursion;

public class AFactorial {
	public static void main(String[] args) {
		int fact = factorial(5);
		System.out.println("Factorial : "+fact);
	}
	
	public static int factorial(int n) {
		System.out.println("Value of n : "+n);
		if(n==0) {
			return 1;
		}else {
			int fac = factorial(n-1);
			System.out.println("Fact ::::"+fac);
			int result = n * fac;
			return result;
		}
	}
}


//Factorial Example