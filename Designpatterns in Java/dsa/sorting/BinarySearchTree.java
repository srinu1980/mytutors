package com.cts.dsa.sorting;

//Class to represent nodes
class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}

public class BinarySearchTree {

	// Root of BST
	Node root;

	// Constructor
	BinarySearchTree() {
		root = null;
	}

	// Insert a new key in BST
	void insert(int key) {
		root = insertRec(root, key);
	}

	Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}

		// Traverse down the tree
		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);

		return root;
	}

	// This method mainly calls deleteRec()
	void delete(int key) {
		root = deleteRec(root, key);
	}

	Node deleteRec(Node root, int key) {
		if (root == null)
			return root;

		// Traverse the tree
		if (key < root.key)
			root.left = deleteRec(root.left, key);
		else if (key > root.key)
			root.right = deleteRec(root.right, key);
		else {
			// Node with one child or no child
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			// Node with two children
			root.key = minValue(root.right);

			root.right = deleteRec(root.right, root.key);
		}
		return root;
	}

	int minValue(Node root) {
		int minValue = root.key;
		while (root.left != null) {
			minValue = root.left.key;
			root = root.left;
		}
		return minValue;
	}

	// Search a key in BST
	boolean search(int key) {
		return searchRec(root, key);
	}

	boolean searchRec(Node root, int key) {
		if (root == null)
			return false;
		if (root.key == key)
			return true;

		if (key < root.key)
			return searchRec(root.left, key);
		return searchRec(root.right, key);
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(50);
		tree.insert(30);
		tree.insert(70);
		tree.insert(20);
		tree.insert(40);
		tree.insert(60);
		tree.insert(80);

		System.out.println(tree.search(25)); // Output: false
		System.out.println(tree.search(70)); // Output: true

		tree.delete(20);
		System.out.println(tree.search(20)); // Output: false
	}
}
