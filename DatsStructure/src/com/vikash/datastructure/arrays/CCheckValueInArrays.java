//Check If Java Array Contains A Certain Value.
package com.vikash.datastructure.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CCheckValueInArrays {
	public static void main(String[] args) {
		Integer[] arr = { 5, 2, 17, 13, 12, 19, 7, 3, 9, 15 };
		System.out.println(firstWay(arr, 17));
		System.out.println(firstWay(arr, 50));
		System.out.println("*****SecondWay*****");
		System.out.println(secondWay(arr, 17));
		System.out.println(secondWay(arr, 50));
		System.out.println("*****Third Way*****");
		System.out.println(thirdWay(arr, 17));
		System.out.println(thirdWay(arr, 50));
		System.out.println("***** Fourth Way*****");
		System.out.println(forthWay(arr, 17));
		System.out.println(forthWay(arr, 50));
		System.out.println("***** Fifth Way*****");
		System.out.println(fifthWay(arr, 17));
		System.out.println(fifthWay(arr, 50));
	}
	
	//Using for loop
	public static boolean firstWay(Integer []arr,int targetValue) {
		boolean status = false;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==targetValue)
				status=true;
		}
		return status;
	}

	//Using binarySearch
	public static boolean secondWay(Integer[]arr,int targetValue) {
		Arrays.sort(arr);
		return Arrays.binarySearch(arr, targetValue) > 0 ? true :false;
	}
	//Using ArrayList
	public static boolean thirdWay(Integer[] arr, int targetValue) {
		List<Integer> list = Arrays.asList(arr); 
		return list.contains(targetValue);
	}
	//Using Set Interface
	public static boolean forthWay(Integer[] arr, int targetValue) {
		List<Integer> list = Arrays.asList(arr); 
		Set<Integer> set = new HashSet<Integer>(list);
		return set.contains(targetValue);
	}
	//Using java 8
	public static boolean fifthWay(Integer[] arr, Integer targetValue) {
		return Arrays.stream(arr).anyMatch(targetValue::equals);
	}
}
