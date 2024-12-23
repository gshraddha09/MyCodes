package com.practice.mylist;

public class Palindrome {

	public static void main(String[] args) {

		String s = "A man,nahm A";

		if (isPalindrome(s))
			System.out.println("true");
		else
			System.out.println("false");

	}

	private static boolean isPalindrome(String s) {
		s = s.trim().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		int i = 0, j = s.length() - 1;
		while (i<(s.length())/2) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;

			}
			i++;
			j--;
		}
		return true;

	}

}
