package com.practice.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Mycode {

	public static void main(String[] args) {
		String input[] = { "flower", "floew", "jallor" };
		String s1 = input[0];
		for (int i = 1; i < input.length; i++) {
			if (s1.length() > input[i].length()) {
				s1 = input[i];
			}
		}

		int count = 0;
		String matchingStr="";
		for (int i = s1.length(); i >= 0; i--) {
			String prefix=s1.substring(0, i);
			boolean isvalid=true;
			for (int j = 0; j < input.length; j++) {
				if (!input[j].startsWith(prefix)) {
					isvalid=false;
					break;
				}
			}
			if(isvalid) {
				matchingStr=prefix;
				break;
			}
			
		}
		System.out.println(matchingStr);
	}

}
