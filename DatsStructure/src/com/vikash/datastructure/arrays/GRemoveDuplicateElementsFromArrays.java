//Printing duplicate Elements from an arrays.
package com.vikash.datastructure.arrays;

public class GRemoveDuplicateElementsFromArrays {
	public static void main(String[] args) {
		int [] arr = new int[]{1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
		removeDuplicate(arr);
	}
	
	public static void removeDuplicate(int[] arr) {
		int current = arr[0];
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (current == arr[i] && !found) {
				found = true;
			} else if (current != arr[i]) {
				System.out.print(" " + current);
				current = arr[i];
				found = false;
			}
		}
		System.out.print(" " + current);
	}
}
