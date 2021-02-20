//Program for array rotation using temp arrays
package com.vikash.datastructure.arraysSorting;

import java.util.Arrays;

public class EArrayRotation1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int noOfRotaiton = 2;

		System.out.println("Given Array : " + Arrays.toString(arr));
		arrayRotation(arr, noOfRotaiton, arr.length - 1);
		System.out.println("First Approach:" + Arrays.toString(arr));

	}

	public static void arrayRotation(int[] arr, int d, int size) {
		int[] tempArr = new int[d];
		for (int i = 0; i < d; i++) {
			tempArr[i] = arr[i];
		}
		int j = 0;
		for (int i = d; i <= size; i++) {
			arr[j] = arr[i];
			j++;
		}
		for (int i = 0; i < tempArr.length; i++) {
			arr[size - d + i + 1] = tempArr[i];
		}
	}

}
