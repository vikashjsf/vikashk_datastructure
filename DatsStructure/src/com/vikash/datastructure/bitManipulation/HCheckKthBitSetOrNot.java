package com.vikash.datastructure.bitManipulation;

public class HCheckKthBitSetOrNot {
	public static void main(String[] args) {
		int n = 16;
		System.out.println(checkKthBitSetOrNot(n, 3));
		/*if(checkKthBitSetOrNot(n, 5)) {
			
		}*/
	}
	
	public static boolean checkKthBitSetOrNot(int n, int k) {
		return (n & (1 << (k - 1))) <= 0;
	}
}
