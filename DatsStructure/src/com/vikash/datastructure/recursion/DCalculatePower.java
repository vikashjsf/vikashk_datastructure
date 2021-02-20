package com.vikash.datastructure.recursion;

public class DCalculatePower {
	public static void main(String[] args) {
		int base = 5;
		int power = 3;
		int calPow = calculatePower(base, power);
		System.out.println(base + " power of " + power + " is : " + calPow);
	}
	
	public static int calculatePower(int base, int power) {
		if (power == 0) {
			return 1;
		} else {
			int res = base * calculatePower(base, power - 1);
			return res;
		}
	}
}
//calculate the power of a number using a recursive function in Java