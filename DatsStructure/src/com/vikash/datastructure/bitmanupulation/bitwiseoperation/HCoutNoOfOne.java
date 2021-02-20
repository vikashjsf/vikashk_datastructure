package com.vikash.datastructure.bitmanupulation.bitwiseoperation;
//Count the number of ones in the binary representation of the given number.
public class HCoutNoOfOne {
	public static void main(String[] args) {
		System.out.println(countNoOfOne(7));
		System.out.println(countNoOfOne(15));
		System.out.println(countNoOfOne(16));
		System.out.println("*************");
		System.out.println(bitcount(7));
		System.out.println(bitcount(15));
		System.out.println(bitcount(16));
	}
	//logN
	public static int countNoOfOne(int x) {
		int count=0;
		while(x!=0) {
			x = x & (x-1);
			//x &= (x - 1);
			++count;
		}
		return count;
	}
	//OR
	public static int bitcount(int x) {
		int b;
		for (b = 0; x != 0; x &= x - 1) ++b;
		return b;
	}
}

/*
//Based on Brian Karnighm's Algorithm
x &= (x-1)  can be written as x = x & (x - 1)

x - 1 is any binary number subtracted by 0000 0001
x - 1 has the property of changing the right most 1 to 0.
          and right most 0 to 1 by using borrows.

*/
