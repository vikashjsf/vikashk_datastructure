//Given an array of integers, every element appears twice except for one. 
//Find that single one.
package com.vikash.datastructure.bitManipulation;

import java.util.HashSet;
import java.util.Set;

public class AFindUniqueElement {
	public static void main(String[] args) {
		int [] arr = {12, 1, 12, 3, 1, 2, 3};
		int x = findSingle(arr);
		System.out.println("x:"+x);
		System.out.println(findSingleNumber(arr));
	}

	// time complexity -  Big O n
	public static int findSingle(int[]arr) {
		int result=arr[0] ;
		for (int i = 1; i < arr.length; i++) {
			System.out.println("Rest 1111 : "+result + " arr : "+arr[i]);
			result=result^arr[i];
		}
		return result;
	}
	
	//Using Java collection API
	public static int findSingleNumber(int[]arr) {
		Set<Integer> set = new HashSet<>();
		for (Integer num : arr) {
			if(set.contains(num)) {
				set.remove(num);
			}else {
				set.add(num);
			}
		}
		return set.iterator().next();
	}
	
}



/*

OR (|) 	AND (&) 	XOR (^) 	Left Shift (<<) 	Right Shift (>>) 	Not (~)
1|0=1 	1&0=0 		1^0=1 		 0010<<2=1000 		 1100>>2=0011 		 ~1=0

The key to solve this problem is bit manipulation. XOR will return 1 only on two different bits. 
So if two numbers are the same, XOR will return 0. Finally only one number left.

*/
