package com.practice.mylist;

import java.util.Stack;

public class ValidParathesis {

	public static void main(String[] args) {
		String s = "{[]}";
		System.out.println(isValidParathesis(s));

	}

	private static boolean isValidParathesis(String s) {
		Stack<Character> stack = new Stack<>();
		int top = -1;
		if (s.length() == 1)
			return false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{') {
				top++;
				stack.push(s.charAt(i));

			} else if ((s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')) {

				if (stack.size() > 0 && (stack.peek() == '[' && s.charAt(i) == ']'
						|| stack.peek() == '{' && s.charAt(i) == '}' || stack.peek() == '(' && s.charAt(i) == ')')) {
					stack.pop();

				} else
					return false;
			}
		}
		return stack.size() > 0 ? false : true;

	}
}
