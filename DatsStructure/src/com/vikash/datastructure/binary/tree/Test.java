package com.vikash.datastructure.binary.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
	TreeNode rootNode=null;
	
	public void insert(int data) {
		  TreeNode newNode = new TreeNode(data);
		  if(rootNode==null) {
			  rootNode=newNode;
		  }else {
			  TreeNode current = rootNode;
			  TreeNode present;
			  while(true) {
				  present=current;
				  if(data < current.data ) {
					  current = current.left;
					  if(current==null) {
						  present.left=newNode;
						  return;
					  }
				  }else {
					  current=current.right;
					  if(current==null) {
						  present.right=newNode;
						  return;
					  }
				  }
			  }
		  }

	}
	
	public TreeNode find(int key) // find node with given key
	{ // (assumes non-empty tree)
		TreeNode current = rootNode; // start at root
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
	
	public void inOrder(TreeNode root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.print(root.data +"-->");
			inOrder(root.right);
		}
	}
	
	public void levelOrderTraversal(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			TreeNode treeNode = queue.poll();
			System.out.print(treeNode.data+"->");
			if(treeNode.left!=null) {
				queue.offer(treeNode.left);
			}
			if(treeNode.right!=null) {
				queue.offer(treeNode.right);
			}
		}
	}
	
	
	public static void main(String[] args) {
		Test test = new Test();
		test.insert(50);
		test.insert(17);
		test.insert(12);
		test.insert(23);
		test.insert(9);
		test.insert(14);
		test.insert(72);
		test.insert(54);
		test.insert(76);
		test.insert(67);
		
		test.levelOrderTraversal(test.rootNode);
		System.out.println("doen");
	}
}
