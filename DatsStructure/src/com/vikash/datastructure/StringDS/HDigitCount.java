//In the given number , find out the number of occurrences of each digit
package com.vikash.datastructure.StringDS;

import java.util.Arrays;

public class HDigitCount {
	public static void main(String[] args) {
		int number = 100356986;
		System.out.println("Given Number is : " + number);
		countEachDigit(number);
	}

	public static void countEachDigit(int n) {
		int[] count = new int[10];
		System.out.println(Arrays.toString(count));
		int temp;
		while (n > 0) {
			temp = n % 10;
			
			// count[temp]++;
			count[temp] = count[temp] + 1;
			System.out.println("temp:"+temp+" "+Arrays.toString(count));
			n = n / 10;
		}
		for (int i = 0; i < count.length; i++) {
			System.out.println(i + " Occures " + count[i] + " times.");
		}
	}
}
