package com.practice.dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

class TreeNode {
	int value;
	TreeNode left;
	TreeNode right;

	TreeNode(int Value) {
		this.value = Value;

	}

}

public class Tree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.left.right.left = new TreeNode(6);
		root.left.right.right = new TreeNode(7);
		// Traversal in inOrder recursive
		System.out.print("inorder is ");
		inOrder(root);
		System.out.println("");
		System.out.print("Preorder is ");
		// Traversal in PreOrder recursive
		preOrder(root);
		System.out.println("");
		System.out.print("PostOrder is ");
		// Traversal in PostOrder recursive
		postOrder(root);
		System.out.println("");
		System.out.println("PreOrder withOut recursion");
		List<Integer> preResult = preOrderWithOutRecursion(root);
		System.out.println(preResult);
		System.out.println("");
		System.out.println("InOrder withOut recursion");
		List<Integer> inResult = inOrderWithOutRecursion(root);
		System.out.println(inResult);
		System.out.println("");
		System.out.println("post withOut recursion");
		List<Integer> postResult = postOrderWithOutRecursion(root);
		System.out.println(postResult);
	}

	private static List<Integer> postOrderWithOutRecursion(TreeNode root) {
		List<Integer> postorder = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		stack.add(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			postorder.add(node.value);
			if (node.left != null)
				stack.push(node.left);
			if (node.right != null)
				stack.push(node.right);
		}
		Collections.reverse(postorder);
		return postorder;
	}

	public static List<Integer> inOrderWithOutRecursion(TreeNode root) {
		List<Integer> inOrder = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode node = root;
		while (true) {
			if (node != null) {
				stack.push(node);
				node = node.left;
			} else {
				if (stack.isEmpty()) {
					break;
				}
				node = stack.pop();
				inOrder.add(node.value);
				node = node.right;
			}
		}

		return inOrder;
	}

	public static List<Integer> preOrderWithOutRecursion(TreeNode root) {
		List<Integer> preorder = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			root = stack.pop();
			preorder.add(root.value);
			if (root.right != null)
				stack.push(root.right);
			if (root.left != null)
				stack.push(root.left);

		}
		return preorder;

	}

	public static void postOrder(TreeNode root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.value + " ");
		}
	}

	public static void inOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.value + " ");
		inOrder(root.right);
	}

	public static void preOrder(TreeNode root) {
		if (root != null) {
			System.out.print(root.value + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

}