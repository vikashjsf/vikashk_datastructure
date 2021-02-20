//Swapping of two number
package com.vikash.datastructure.bitManipulation;

public class ESwapTwoNumber {
	public static void main(String[] args) {
		int x =10;
		int y = 03;
		System.out.println("X:"+x + " Y:"+y);
		x = x^y;
		y = x^y;
		x = x^y;
		System.out.println("X:"+x + " Y:"+y);
	}
}
