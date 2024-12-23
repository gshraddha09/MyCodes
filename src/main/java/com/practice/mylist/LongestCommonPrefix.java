package com.practice.mylist;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] names = { "flower", "flow", "flight" };
		String s=getLongestCommonPrefix(names);
		System.out.println(s);
	}

	private static String getLongestCommonPrefix(String[] strs) {
		if (strs.length == 1) {
			return strs[0];
		} else {
			String start = strs[0];
			for (int i = 0; i < strs.length; i++) {
				start = lcm(start, strs[i]);
			}
			if (start.equals("")) {
				return start;
			}
			return start;
		}
	}

	private static String lcm(String str1, String str2) {
		int i = 0, j = 0;
		int n = str1.length();
		int m = str2.length();
		while (i < n && j < m) {
			if (str1.charAt(i) != str2.charAt(j)) {
				break;
			}
			i++;
			j++;
		}
		return str1.substring(0, j);
	}
}
