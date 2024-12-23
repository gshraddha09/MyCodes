package com.practice.mylist;

public class FirstOccurenceOfString {

	public static void main(String[] args) {
		String s = "leetecode";
		String s1 = "eete";

		System.out.println(getFirstOccurence(s, s1));

	}

	private static int getFirstOccurence(String s, String s1) {
		int index = -1;
		boolean isFound = false;
		for (int i = 0; i < s.length(); i++) {

			if (i + s1.length()<=s.length() && s1.equals(s.substring(i, i + s1.length()))) {
				index = i;

				return index;
			}

		}

		return index;

	}

}
