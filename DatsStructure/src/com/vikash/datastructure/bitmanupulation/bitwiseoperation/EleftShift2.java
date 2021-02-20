package com.vikash.datastructure.bitmanupulation.bitwiseoperation;
//1 2 4 8 16 32 64 128 256 512 1024 
public class EleftShift2 {
	public static void main(String[] args) {
		table(1);
	}
	
	public static void table(int n) {
		for (int i = 0; i <= 10; i++) {
			System.out.print((n<<i)+" ");
		}
	}
}

