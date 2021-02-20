package com.vikash.datastructure.binarySearchTree;

import java.util.Arrays;

public class BTernarySearch {
	public static void main(String[] args) {
		int [] arr = {10,8,9,7,6};
		System.out.println("Given Arrays : "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After Sort : "+Arrays.toString(arr));
		/*int index = ternary_search(arr,0,arr.length, 30);
		System.out.println("index :"+index);*/
		ternarySearch(arr,arr.length,8);
		/*if(index>=0) {
			System.out.println("Number is present at index values :"+index);
		}else {
			System.out.println("Sorry!! Given number is not present in the list.");
		}*/
	}

	private static int ternarySearch(int[] arr, int size, int searchKey) {
		 int low,high,first,second,third;
		 low =0;
		 high =size-1;
		 first=high/3;
		 second=high*(2/3);
		 third=high;
		 System.out.println("first:"+first + " Second :"+second + " third "+third);
		return 0;
	}
	
	static int ternary_search(int[] ar, int l, int r, int x) {
		if (r >= l) {
			int mid1 = l + (r - l) / 3;
			int mid2 = r - (r - l) / 3;
			if (ar[mid1] == x)
				return mid1;
			if (ar[mid2] == x)
				return mid2;
			if (x < ar[mid1])
				return ternary_search(ar, l, mid1 - 1, x);
			else if (x > ar[mid2])
				return ternary_search(ar, mid2 + 1, r, x);
			else
				return ternary_search(ar, mid1 + 1, mid2 - 1, x);

		}
		return -1;
	}
}
