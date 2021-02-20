//Check if a number is a power of another number
package com.vikash.datastructure.arraysSorting;

public class DPowerOfAnotherNumber {
	public static void main(String[] args) {
		//checkPowerMyApproach(25,625);
		usingMultiplication(5,625);
	}

	public static void checkPowerMyApproach(int x, int y) {
		int count = 0;
		while (y >= x) {
			if ((x == y) && count == 0) {
				System.out.println("Given number is power of x :" + x + "^" + 1);
				break;
			} else {
				y = y / x;
				++count;
			}
		}
		if (y == 1) {
			System.out.println("Given number is power of x :" + x + "^" + count);
		} else {
			System.out.println("Given number is not the power of another number !!");
		}
	}
	
	public static void usingMultiplication(int x, int y) {
		if (x > 0 && x == y)
			System.out.println("Given number is power of 1 of the first number !!");
		int pow = 1;
		while (pow < y)
			pow = pow * x;
		if (pow == y)
			System.out.println("Given number is power of another number !!");
		else
			System.out.println("Given number is not power of another number !!");

	}
}
