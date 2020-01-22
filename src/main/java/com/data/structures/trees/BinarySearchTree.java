package com.data.structures.trees;

public class BinarySearchTree {
	
	class Node {
		int key;
		Node left;
		Node right;
		
		public Node(int item) {
			key = item;
			left = right = null;
		}
	}
	
	Node root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	void deleteKey(int key) {
		root = deleteRec(root, key);
	}
	

	private Node deleteRec(Node root, int key) {
		
		if(root == null) {
			return root;
		}
		
		if(key < root.key) {
			root.left = deleteRec(root.left, key);
		}
		
		else if(key > root.key) {
			root.right = deleteRec(root.right, key);
		}
		
		else {
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
		}
		
		return null;
	}
	
	void insertKey(int key) {
		root = insertRec(root, key);
	}
	

	private Node insertRec(Node root, int key) {
		
		if(root == null) {
			return root;
		}
		
		if(key < root.key) {
			root.left = deleteRec(root.left, key);
		}
		
		else if(key > root.key) {
			root.right = deleteRec(root.right, key);
		}
		
		return root;
	}

	public static void main(String[] args) {
		

	}

}
