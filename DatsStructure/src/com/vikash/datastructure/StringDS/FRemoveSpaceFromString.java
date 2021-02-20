//Remove spaces from a given string
package com.vikash.datastructure.StringDS;

public class FRemoveSpaceFromString {

	public static void main(String[] args) {
		String str = "I am from india.";
		myApproach1(str);
		myApproach2(str);
		fromGFG(str);
	}
	public static void myApproach1(String str) {
		String[] word = str.split("\\s");
		String result="";
		for (String string : word) {
			result=result+string;
		}
		System.out.println("Resultant String : "+result);
	}
	public static void myApproach2(String str) {
		String result=""; 
		for (char ch : str.toCharArray()) {
			if(ch!=' ') {
				result=result+Character.toString(ch);
			}
		}
		System.out.println("Resultant String : "+result);
	}
	
	public static void fromGFG(String str) {
		System.out.println("Resultant String : "+str.replaceAll("\\s", ""));
	}
}
