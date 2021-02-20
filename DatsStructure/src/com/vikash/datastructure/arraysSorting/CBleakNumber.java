//Check if a number is Bleak
package com.vikash.datastructure.arraysSorting;

public class CBleakNumber {
	
	// Driver code 
    public static void main(String args[]) 
    { 
        if (checkBleakNumber(1)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
        if (checkBleakNumber(3)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
	
	static boolean checkBleakNumber(int n) {
		for (int i = 1; i < n ; i++) {
			if(( i + countOne(n))==n)
				return false;
		}
		return true;
	}
	
	static int countOne(int x) {
		int count = 0;
		if (x == 0)
			return 0;
		while (x != 0) {
			x &= (x - 1);
			++count;
		};
		System.out.println("Number:"+x +"1's cont : "+count);
		return count;
	}
}
/*

A number ‘n’ is called Bleak if it cannot be represented as sum of a 
	positive number x and set bit count in x, i.e., x + countSetBits(x) is 
	not equal to n for any non-negative number x.

Examples :

Input : n = 3
Output : false
3 is not Bleak as it can be represented
as 2 + countSetBits(2).

Input : n = 4
Output : true
4 is t Bleak as it cannot be represented 
as sum of a number x and countSetBits(x)
for any number x.

*/
