package com.vikash.datastructure.StringDS;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Java Program to find duplicate characters in String.

public class AFindDuplicateCharacters {
	public static void main(String[] args) {
		methodFirst("Programmingg");
		System.out.println("*************");
		methodSecond("Programmingg");
		System.out.println("------------------");
		String str = printDuplicate("Programmingggggz");
		System.out.println(str);
	}
	
	public static void methodFirst(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char ch[] = str.toCharArray();

		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, (map.get(c)) + 1);
			} else {
				map.put(c, 1);
			}
		}
		Set<Character> set = map.keySet();
		Iterator<Character> it = set.iterator();
		while (it.hasNext()) {
			char cha = it.next();
			if (map.get(cha) > 1) {
				System.out.println("Character : " + cha + " Value: " + map.get(cha));
			}
		}
	}

	public static void methodSecond(String str) {
		char[] ch = str.toCharArray();
		int count = 0;

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					System.out.println("First Duplicate Character : " + ch[j]);
					break;
				}
			}
		}
		System.out.println("Total number of duplicate Character is : " + count);
	}

	public static String printDuplicate(String s) {
		int counts[] = new int[123];
		StringBuilder res = new StringBuilder();

		for (char c : s.toCharArray())
			counts[c]++;

		System.out.println(Arrays.toString(counts));
		
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] > 1) {
				res.append((char) i);
				//break;
			}
		}
		return res.toString();
	}


}
