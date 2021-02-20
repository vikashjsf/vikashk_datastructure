// How to find the missing number in integer array of 1 to 100?
package com.vikash.datastructure.arrays;

public class AFindMissingNumber1 {
	public static void main(String[] args) {
		int [] arr = {1,2,5,3};
		int missingNumber = findMissingNumber(arr,arr.length+1);
		System.out.println("Missing Number is : "+missingNumber);
		int missingNumber1 = usingXorOperation(arr,arr.length);
		System.out.println("Missing Number : "+missingNumber1);
	}
	
	//Time Complexity : O(n)
	public static int findMissingNumber(int[] arr, int n) {
		int sum = 0, total;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		total = (n * (n + 1)) / 2;
		return total - sum;
	}
	//Finding Missing number using XOR operator
	public static int usingXorOperation(int[] arr, int n) {
		int x1 = arr[0];
		for (int i = 1; i < n; i++) {
			x1 = x1 ^ arr[i];
		}
		int x2 = 1;
		for (int i = 2; i <=n+1 ; i++) {
			x2 = x2 ^ i;
		}
		return x1 ^ x2;
	}
}
/*

Truth table of “Exclusive-OR” or XOR gate is :

X	Y	 Output
0	0	 0
0	1	1
1	0	 1
1	1	0

*/
