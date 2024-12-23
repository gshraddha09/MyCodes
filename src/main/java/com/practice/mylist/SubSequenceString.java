package com.practice.mylist;

public class SubSequenceString {
	public static void main(String args[]) {
		String s = "abci";
		String t = "";
		int i = 0, j = 0, c = 0;
		while (i < s.length() && j < t.length()) {
			if(s.charAt(i)==t.charAt(j)) {
				i++;
				j++;
				c++;
			}
			j++;

		}
		System.out.println(c==s.length()?true:false);

	}

}
