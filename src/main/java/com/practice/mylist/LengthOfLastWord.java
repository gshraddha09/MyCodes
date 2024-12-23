package com.practice.mylist;

import java.util.Arrays;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String s = "    day  is    ";
		
		System.out.println(getLengthOfLastWord(s));
	}

	private static int getLengthOfLastWord(String s) {
		int count = 0;
		s = s.trim();
		System.out.println(s);

		for (int i = s.length()-1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				count++;

			}
			else return count;

		}
		return count;
	}

}
