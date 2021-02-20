/*
Turning on kth Bit
i.e 4 = 100 and want to set k=1 then it becomes 101
*/
package com.vikash.datastructure.bitManipulation;

public class GTurningOnKthBit {
	public static void main(String[] args) {
		int x =9;
		int k = 2;
		int res = turningOnKthBit(x, k);
		System.out.println("x:"+ x +":   Binary :"+Integer.toBinaryString(x));
		System.out.println("res:"+ res +": Binary :"+Integer.toBinaryString(res));
	}
	
	public static int turningOnKthBit(int n, int k) {
		return n | (1<<(k-1));
	}
}
