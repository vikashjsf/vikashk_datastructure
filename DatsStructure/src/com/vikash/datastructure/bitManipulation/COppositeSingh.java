// Detect whether two given numbers are opposite sign or not
package com.vikash.datastructure.bitManipulation;

public class COppositeSingh {
	public static void main(String[] args) {
		int x = 5;
		int y = -2;
		String str = (x ^ y) < 0 ? "Opposite Sign" : "Not opposite Singh";
		System.out.println(str);
		//Demo
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		System.out.println(Integer.toBinaryString(x ^ y));
	}
}
