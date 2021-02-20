
//Check if an given integer is even or odd
package com.vikash.datastructure.bitManipulation;

public class BoddEven {
	public static void main(String[] args) {
		int x = 1222222223;
		String str = (x & 1) == 1 ? "Given Number is odd number" : "Given Number is Even number";
		System.out.println(str);
	}
}
/*
n & 1  will return value 1 or 0 depending
upon n is add or even.
*/