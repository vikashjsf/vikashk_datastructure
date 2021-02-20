//Reverse an array without affecting special characters
package com.vikash.datastructure.StringDS;

public class VReverseWithoutEffectingSpecialCharacter {
	public static void main(String[] args) {
		String str = "a$b%cde@f";//"a!!!b.c.d,e'f,ghi"
		System.out.println(str);
		reverseWithoutEffectingSpecialCharacter(str);
	}
	// big O of n time complexity
	public static String reverseWithoutEffectingSpecialCharacter(String str) {
		char[] ch = str.toCharArray();
		int sIndex=0, eIndex=ch.length-1;
		for (int i = 0; i < ch.length; i++) {
			while(sIndex<eIndex) {
				//Ignoring special character.
				if(Character.isAlphabetic(ch[sIndex])==false) // we can use ! also
					sIndex++;
				else if(Character.isAlphabetic(ch[eIndex])==false)
					eIndex--;
				else {
					// swapping
					char temp = ch[sIndex];
					ch[sIndex]=ch[eIndex];
					ch[eIndex]=temp;
					sIndex++;
					eIndex--;
				}
			}
		}

		System.out.println(new String(ch));
		return new String(ch);
	}
}
/*
a!!!b.c.d,e'f,ghi
01234567890123456 

*/