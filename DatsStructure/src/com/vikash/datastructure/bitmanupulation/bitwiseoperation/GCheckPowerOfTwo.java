//1) How to check if a given number is a power of 2 ?
package com.vikash.datastructure.bitmanupulation.bitwiseoperation;

public class GCheckPowerOfTwo {
	public static void main(String[] args) {
		System.out.println(generalApproach(64));
	}

	public static String generalApproach(int x) {
		if(x==0) return "No";
		while(x%2==0) {
			x=x/2;
		}
		return (x==1 ? "Yes" :"No");
	}
	
	// LogN 
	static String isPowerOfTwo2(int x) {
		x = x & (x - 1);
		if (x == 0) {
			return "Yes";
		} else {
			return "No";
		}
	}
}
