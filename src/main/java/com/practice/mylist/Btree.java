package com.practice.mylist;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class TreeNode {
	int value;
	TreeNode left;
	TreeNode right;

	public TreeNode(int value) {
		this.value = value;
	}
}

public class Btree {

	public static void main(String[] args) {
		// create a TreeNode
		TreeNode root = null;
		System.out.println(root);

		Scanner scan = new Scanner(System.in);
		System.out.println("enter size to create Tree");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("enter node " + i);
			root = insertNode(scan.nextInt(), root);

		}
		System.out.println(root);
		inorderTravseral(root);

	}

	public static TreeNode insertNode(int key, TreeNode root) {
		if (root == null) {
			root= new TreeNode(key);
			return root;
		}
		if (key < root.value) {
			root.left=insertNode(key, root.left);

		} else if (key > root.value) {
			root.right=insertNode(key, root.right);
		}
		return root;

	}

	public static void inorderTravseral(TreeNode root) {
		// left root right
		if (root == null) {
			return;
		}
		inorderTravseral(root.left);
		System.out.print(root.value + ",");
		inorderTravseral(root.right);

	}
}