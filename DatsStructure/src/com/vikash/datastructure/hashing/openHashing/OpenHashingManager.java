package com.vikash.datastructure.hashing.openHashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OpenHashingManager {

	public static void main(String[] args) throws IOException {
		int aKey;
		Node node;
		int size;
		// get sizes
		System.out.print("Enter size of hash table: ");
		size = getInt();
		 
		// make table
		HashTable theHashTable = new HashTable(size);

		while (true) {
			System.out.print("Enter first letter of ");
			System.out.print("show, insert, delete, or find: ");
			char choice = getChar();
			switch (choice) {
			case 's':
				theHashTable.displayTable();
				break;
			case 'i':
				System.out.print("Enter key value to insert: ");
				aKey = getInt();
				node = new Node(aKey);
				theHashTable.insert(node);
				break;
			case 'd':
				System.out.print("Enter key value to delete: ");
				aKey = getInt();
				theHashTable.delete(aKey);
				break;
			case 'f':
				System.out.print("Enter key value to find: ");
				aKey = getInt();
				node = theHashTable.find(aKey);
				if (node != null)
					System.out.println("Found " + aKey);
				else
					System.out.println("Could not find " + aKey);
				break;
			default:
				System.out.print("Invalid entry\n");
			}  
		}  
	}  

	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

	public static char getChar() throws IOException {
		String s = getString();
		return s.charAt(0);
	}

	public static int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}
}
