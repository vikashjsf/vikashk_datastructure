package com.vikash.datastructure.binary.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Print_Level_Btree {
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
		printLevelBtree(binaryTree.root);
	}
	
	public static void printLevelBtree(TreeNode root){
		Queue<Pair> queue = new LinkedList<Pair>();
		queue.offer(new Pair(root, 0));
		while(!queue.isEmpty()) {
			Pair pair = queue.poll();
			 System.out.println("Level of " + pair.treeNode.data + " is " + pair.level); 
			if(pair.treeNode.left!=null) {
				queue.offer(new Pair(pair.treeNode.left,pair.level+1));
			}
			if(pair.treeNode.right!=null) {
				queue.offer(new Pair(pair.treeNode.right,pair.level+1));
			}
		}
	}
}
