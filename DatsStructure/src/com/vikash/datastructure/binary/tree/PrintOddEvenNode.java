package com.vikash.datastructure.binary.tree;
//Function to print all even nodes  
public class PrintOddEvenNode {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insert(25);
		binaryTree.insert(20);
		binaryTree.insert(36);
		binaryTree.insert(10);
		binaryTree.insert(22);
		binaryTree.insert(30);
		binaryTree.insert(40);
		binaryTree.insert(5);
		binaryTree.insert(12);
		binaryTree.insert(28);
		binaryTree.insert(38);
		binaryTree.insert(48);
		System.out.println();
		System.out.println("Tree Node which consisting even number :");
		printEvenNodeUsingInOrder(binaryTree.root);
		
		System.out.println("\nTree Node which consisting odd number :");
		printOddNodeUsingInOrder(binaryTree.root);
	}

	private static void printEvenNodeUsingInOrder(TreeNode root) {
		if(root!=null) {
			printEvenNodeUsingInOrder(root.left);
			if (root.data % 2 == 0)
				System.out.print(root.data + " ");
			printEvenNodeUsingInOrder(root.right);
		}
	}
	
	private static void printOddNodeUsingInOrder(TreeNode root) {
		if(root!=null) {
			printOddNodeUsingInOrder(root.left);
			if (root.data % 2 != 0)
				System.out.print(root.data + " ");
			printOddNodeUsingInOrder(root.right);
		}
	}
}
