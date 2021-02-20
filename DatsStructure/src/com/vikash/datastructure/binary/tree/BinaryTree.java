package com.vikash.datastructure.binary.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	public TreeNode root;
	
	public BinaryTree() {
		root = null;
	}
	
	
	public void insert(int id) {
		TreeNode newNode = new TreeNode(id); // make new node
		if (root == null) { // no node in root
			root = newNode;
		}else{ // root occupied
			TreeNode current = root; // start at root
			TreeNode parent;
			while (true) // (exits internally)
			{
				parent = current;
				if (id < current.data) // go left?
				{
					current = current.left;
					if (current == null) // if end of the line,
					{ // insert on left
						parent.left = newNode;
						return;
					}
				} // end if go left
				else // or go right?
				{
					current = current.right;
					if (current == null) // if end of the line
					{ // insert on right
						parent.right = newNode;
						return;
					}
				} // end else go right
			} // end while
		} // end else not root
	} // end insert()
	
	public TreeNode find(int key) // find node with given key
	{ // (assumes non-empty tree)
		TreeNode current = root; // start at root
		while (current.data != key) // while no match,
		{
			if (key < current.data) // go left?
				current = current.left;
			else// or go right?
				current = current.right;
			if (current == null) // if no child,
				return null; // didn't find it
		}
		return current; // found it
	} // end find()
	
	public void createBinaryTree() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		TreeNode seventh = new TreeNode(7);
		root = first;
		first.left=second;
		first.right=third;
		
		second.left=fourth;
		second.right=fifth;
		
		third.left=sixth;
		third.right=seventh;
	}
	
	public void levelOrderTraversal(TreeNode root) {
		if (root != null) {
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			queue.offer(root);
			while (!queue.isEmpty()) {
				TreeNode treeNode = queue.poll();
				System.out.print(treeNode.data + "-->");
				if (treeNode.left != null) {
					queue.offer(treeNode.left);
					// System.out.println(treeNode.data +"-->");
				}
				if (treeNode.right != null) {
					// System.out.println(treeNode.data +"-->");
					queue.offer(treeNode.right);
				}
			}
		}
	}
	
	public void inOrder(TreeNode root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.print(root.data +"-->");
			inOrder(root.right);
		}
	}
	
	public void preeOrder(TreeNode root) {
		if(root!=null) {
			System.out.print(root.data +"-->");
			preeOrder(root.left);
			preeOrder(root.right);
		}
	}
	
	public void postOrder(TreeNode root) {
		if(root!=null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data +"-->");
		}
	}
}
