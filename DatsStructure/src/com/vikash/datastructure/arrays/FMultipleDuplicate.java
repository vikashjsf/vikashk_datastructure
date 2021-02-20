// Find duplicates in O(n) time and O(1) extra space in the integer Arrays
package com.vikash.datastructure.arrays;

public class FMultipleDuplicate {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1, 3, 6, 6 };//2,3
		findMultipleDuplicate(arr);
	}

	public static void findMultipleDuplicate(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int x=Math.abs(arr[i]);
			//System.out.println("Before : "+arr[i] + "  After->"+x +" arr[x]:"+ arr[x]);
			if (arr[x] >= 0)
				arr[x] = -arr[x];
			else
				System.out.print(Math.abs(arr[i]) + " ");
		}
	}
}
