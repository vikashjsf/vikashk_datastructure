package com.vikash.datastructure.binary.tree;

import java.util.LinkedList;
import java.util.Queue;
//Print all nodes between two given levels in Binary Tree
//https://www.geeksforgeeks.org/print-all-nodes-between-two-given-levels-in-binary-tree/
public class GetNodeBetweenTwoLevel {
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
		printNodesBetweenGivenLevels(binaryTree.root,2,3);
	}

	
	//TO DO
	private static void printNodesBetweenGivenLevels(TreeNode root,int startLevel,int endLevel) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		int level=0;
		while(!queue.isEmpty()) {
			TreeNode treeNode = queue.poll();
			
			if (level >= startLevel && level <= endLevel) { 
                System.out.print(treeNode.data + " "); 
			}
			if(treeNode.left!=null) {
				queue.offer(treeNode.left);
			}
			if(treeNode.right!=null) {
				queue.offer(treeNode.right);
			}
			level++;
		}
	}
}
