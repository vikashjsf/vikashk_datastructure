//How to find largest and smallest number from integer array

package com.vikash.datastructure.arrays;

public class DLargestAndSmallest {
	public static void main(String[] args) {
		Integer[] arr={20, 34, 21, 87, 92,Integer.MAX_VALUE};
		findLargestAndSmallest(arr);
	}
	
	public static void findLargestAndSmallest(Integer[] arr) {
		int smallest = arr[0], largest = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > smallest) {
				largest = arr[i];
			} else {
				smallest = arr[i];
			}
		}
		System.out.println("Smallest :" + smallest + " Larget : " + largest);
	}
}
