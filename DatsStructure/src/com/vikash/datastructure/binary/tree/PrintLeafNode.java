package com.vikash.datastructure.binary.tree;
//Print all leaf nodes of a Binary Tree from left to right
public class PrintLeafNode {
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
		
		System.out.println("Left to right Leaf node");
		printLeafNodeFromL2R(binaryTree.root);
		System.out.println();
		System.out.println("Right to Left Leaf node");
		printLeafNodeFromR2L(binaryTree.root);
	}

	private static void printLeafNodeFromL2R(TreeNode root) {
		if(root!=null) {
			if(root.left ==null && root.right==null) {
				System.out.print(root.data +" ");
			}
			printLeafNodeFromL2R(root.left);
			printLeafNodeFromL2R(root.right);
		}
	}
	
	private static void printLeafNodeFromR2L(TreeNode root) {
		if(root!=null) {
			if(root.left ==null && root.right==null) {
				System.out.print(root.data +" ");
			}
			printLeafNodeFromR2L(root.right);
			printLeafNodeFromR2L(root.left);
		}
	}
}
