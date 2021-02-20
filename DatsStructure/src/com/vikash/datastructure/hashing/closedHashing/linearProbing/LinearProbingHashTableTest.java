package com.vikash.datastructure.hashing.closedHashing.linearProbing;

import java.util.Scanner;

public class LinearProbingHashTableTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hash Table Test");
		System.out.println("Enter size");
		LinearProbingHashTable qpht = new LinearProbingHashTable(scan.nextInt());
		char ch;
		do {
			System.out.println("Hash Table Operations");
			System.out.println("1. insert ");
			System.out.println("2. remove");
			System.out.println("3. get");
			System.out.println("4. clear");
			System.out.println("5. size");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter key and value");
				qpht.insert(scan.next(), scan.next());
				break;
			case 2:
				System.out.println("Enter key");
				qpht.remove(scan.next());
				break;
			case 3:
				System.out.println("Enter key");
				System.out.println("Value = " + qpht.get(scan.next()));
				break;
			case 4:
				qpht.makeEmpty();
				System.out.println("Hash Table Cleared");
				break;
			case 5:
				System.out.println("Size = " + qpht.getSize());
				break;
			default:
				System.out.println("Wrong Entry ");
				break;
			}
			/** Display hash table **/
			qpht.printHashTable();
			System.out.println("Do you want to continue (Type y or n)");
			ch = scan.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
	}
}