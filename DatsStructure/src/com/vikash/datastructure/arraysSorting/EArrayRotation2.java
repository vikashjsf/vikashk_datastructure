//Program for array rotation using one by one
package com.vikash.datastructure.arraysSorting;

import java.util.Arrays;

public class EArrayRotation2 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int noOfRotaiton = 2;

		for (int i = 1; i <= noOfRotaiton; i++) {
			arrayRotationOneByOne(arr, arr.length);
		}
		System.out.println("Second Approach : " + Arrays.toString(arr));
	}

	public static void arrayRotationOneByOne(int[] arr, int size) {
		int temp = arr[0];
		for (int i = 0; i < size - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[size - 1] = temp;
	}
}
