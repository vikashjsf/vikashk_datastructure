//K'th Smallest/Largest Element in Unsorted Array.
package com.vikash.datastructure.arraysSorting;

import java.util.Arrays;

public class BKthSmallestLargest {
	public static void main(String[] args) {
		int arr[] = {7, 10, 4, 3, 20, 15};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int k=4;
		System.out.println(k +"th largest element in the given arrays is :"+arr[k-1]);
	}
}
