/*
Turning off kth bit - i . e in binary form of the given number 
let k = 2 - 2nd One from the left making it as zero 
*/
package com.vikash.datastructure.bitManipulation;

public class FTurningOffKthBit {
	public static void main(String[] args) {
		int x = 15;
		//System.out.println(1<<2);
		System.out.println(x + ":Binary Form :" + Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(turnOffKthBit(x, 3)));
	}
	
	static int turnOffKthBit(int n, int k)
	{
		int res = 1<<(k-1);
		System.out.println("Res:"+res +" ~res : "+ ~res);
		System.out.println("Res:"+Integer.toBinaryString(res));
		System.out.println("~res :"+Integer.toBinaryString(~res));
		return n & ~res;
	}
}
