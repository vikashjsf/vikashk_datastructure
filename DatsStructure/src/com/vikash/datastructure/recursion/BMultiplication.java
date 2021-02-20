package com.vikash.datastructure.recursion;
//WAP to display first four multiple of a number using recursion
public class BMultiplication {
	public static void main(String[] args) {
		multiple(10);
		System.out.println("Finished");
	}
	
	public static void multiple(int n) {
		if(n <10000) {
			System.out.println(n);
			multiple(n*5);
			System.out.println("********************");
			System.out.println(n);
		}
	}
}
