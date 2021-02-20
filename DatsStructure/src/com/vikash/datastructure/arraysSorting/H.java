package com.vikash.datastructure.arraysSorting;

public class H {
	public static void main(String[] args) {
		int[] arr = { 11, 15, 6, 8, 9, 10,4 };
		int sum = 14;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == sum) {
					System.out.println("There is a pair "
							+ "(" + arr[i] + "," + arr[j] + ") with sum :" + sum);
				}
			}
		}
	}
}
