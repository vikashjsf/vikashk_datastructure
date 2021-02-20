package com.vikash.datastructure.StringDS;
//Write a Program to check if strings are rotations of each other or not

public class URotationOfEachOther {
	public static void main(String[] args) {
		 String str1 = "AACD"; 
	     String str2 = "ACDA";
	     if(checkRotation(str1, str2))
	    	 System.out.println("Given Strings are rotation of each other!!");
	     else
	    	 System.out.println("Given Strings are not rotation of each other!!");
	}
	
	public static boolean checkRotation(String s1, String s2) {
		if(s1.length()!=s2.length())
			return false;
		String temp = s1+s1;
		return temp.indexOf(s2)!=-1;
	}
}
