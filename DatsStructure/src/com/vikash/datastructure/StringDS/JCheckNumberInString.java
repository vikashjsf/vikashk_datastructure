//Regular Expression in Java to check numbers in String 

package com.vikash.datastructure.StringDS;

import java.util.regex.Pattern;

public class JCheckNumberInString {
	public static void main(String[] args) {
		String [] numbers = {"123", "1234" , "123.12", "abcd123", "123456"};
		firstApproach(numbers);
		System.out.println("***Second Approach***");
		SecondApproach(numbers);
		System.out.println("*********Third Approach*************");
		thirdApproach(numbers);
		System.out.println("****Fourth Approach*****");
		fourthApproach(numbers);
	}
	
	
	
	//Regular expression in Java to check if String is number or not
	public static void firstApproach(String[]arr) {
        Pattern pattern = Pattern.compile(".*[^0-9].*");
        //Pattern pattern = Pattern.compile(".*\\D.*");
        for(String input: arr){
            System.out.println( "does " + input + " is number : "
                                 + !pattern.matcher(input).matches());
        }
	}
	
	// Regular expression in java to check if String is 6 digit number or not
	public static void SecondApproach(String[]arr) {
		 Pattern digitPattern = Pattern.compile("\\d{6}");       
	       //Pattern digitPattern = Pattern.compile("\\d\\d\\d\\d\\d\\d")
        for(String input: arr){
            System.out.println( "does " + input + " is number : "
                                 +digitPattern.matcher(input).matches());
        }
	}
	
	// Regular expression in java to check number digit in a string.
	public static void thirdApproach(String[]arr) {
		 Pattern digitPattern = Pattern.compile("\\d+");       
	       //Pattern digitPattern = Pattern.compile("\\d\\d\\d\\d\\d\\d")
        for(String input: arr){
            System.out.println( "does " + input + " is number : "
                                 +digitPattern.matcher(input).matches());
        }
	}
	
	//Java Regular Expression to Check If String contains at least One Digit
	public static void fourthApproach(String[]arr) {
		 Pattern digitPattern = Pattern.compile("(.)*(\\d)(.)*");       
       for(String input: arr){
           System.out.println( "does " + input + " is number : "
                                +digitPattern.matcher(input).matches());
       }
	}
}
