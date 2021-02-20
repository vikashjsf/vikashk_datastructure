//Java Program to find first duplicate, non-repeated character in a String.
package com.vikash.datastructure.StringDS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BFirstNonRepeatedChar {
	public static void main(String[] args) {
		System.out.println(firstNonRepeatedChar1("vikashkumar"));
		System.out.println("**************22***************");
		System.out.println(firstNonRepeatedChar2("vikashkumar"));
		System.out.println("************33*****************");
		System.out.println(firstNonRepeatedChar3("hello"));
	}
	
	
	//Using LinkedHashMap
	public static char firstNonRepeatedChar1(String str) {
		Map<Character, Integer> map = new LinkedHashMap<Character,Integer>();
		char[] ch = str.toCharArray();
		
		for (char c : ch) {
			map.put(c, map.containsKey(c) ? map.get(c)+1 :1);
		}
		
		/*for (Entry<Character, Integer> entry : map.entrySet()) {
			 if(entry.getValue()==1) {
				return entry.getKey();
			 }
		}*/
		//OR
		Set<Character> set =map.keySet();
		Iterator<Character> iterator = set.iterator();
		while(iterator.hasNext()) {
			char key = iterator.next();
			if(map.get(key)==1) {
				return key;
			}
		}
		
		return 0 ;
	}
	
	//Using HashMap
	public static char firstNonRepeatedChar2(String str) {
		 Map<Character, Integer> map = new HashMap<Character,Integer>();
		 
		 for (int i = 0; i < str.length(); i++) {
			 char key = str.charAt(i);
			 map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
		 }
		  
		 // since HashMap doesn't maintain order, going through string again
		 
		 for (int i = 0; i < str.length(); i++) {
			char key = str.charAt(i);
			if(map.get(key)==1)
				return key;
		 }
		return 0 ;
	}
	
	//Using Set and List interface
	public static char firstNonRepeatedChar3(String str) {
		Set<Character> set = new HashSet<Character>();// Contains the repeated character
		List<Character> list = new ArrayList<Character>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (set.contains(ch))
				continue;
			if (list.contains(ch)) {
				list.remove((Character) ch);
				set.add(ch);
			} else {
				list.add(ch);
			}
		}
		return list.get(0);
	}
	 
///http://www.java67.com/2018/06/data-structure-and-algorithm-interview-questions-programmers.html
}
