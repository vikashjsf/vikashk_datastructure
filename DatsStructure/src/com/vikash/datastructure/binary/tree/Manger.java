package com.vikash.datastructure.binary.tree;

public class Manger {
	public static void main(String[] args) {
		int id = 10;
		while (true) // (exits internally)
		{
			System.out.println("in while loop");
			if (id < 20) // go left?
			{
				System.out.println("in if block");
				return;
			} // end if go left
			if (id < 15)// or go right?
			{
				System.out.println("inside second if block");
				return;
			}
			if (id < 9) {
				System.out.println("Inside thired if block");
				return;
			}

		}
	}
	
	
	 
}

