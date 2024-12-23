package com.practice.october;

import java.util.*;

public class LongestSubStringWithOutRepeatingChars {

	public static void main(String[] args) {
		String s = "aibici";
		List<Character> output = new ArrayList<>();
		int left = 0,maxlen=0;
		for (int right = 0; right < s.length(); right++) {
			if (!output.contains(s.charAt(right))) {
				output.add(s.charAt(right));
				maxlen=Math.max(maxlen, output.size());
			}
			else {
				output.remove(Character.valueOf(s.charAt(left)));
				left++;
			}
		}
		System.out.println(maxlen);

	}

}
