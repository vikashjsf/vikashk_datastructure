//Search an element in a sorted and rotated array time complexity is O(log n) time
// Need to use Binary Search tree 
package com.vikash.datastructure.arraysSorting;

import java.util.Arrays;

public class GSearchAnElements {
	public static void main(String[] args) {
		int arr[] = {30, 40, 50, 10, 20};
		Arrays.sort(arr);
		int index = binarySearch(arr,10);
		if(index  >= 0) {
			System.out.println("Value present at index :"+index);
		}else {
			System.out.println("Sorry!! Given number is not present!!");
		}
	}
	// Binary Search
	public static int binarySearch(int[] arr, int key) {
		int low = 0, high = arr.length - 1, mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (key == arr[mid]) {
				return mid;
			} else if (key < arr[mid]) {
				high = mid - 1;
			} else { // key >arr[mid]
				low = mid + 1;
			}
		}
		return -1;
	}
}
