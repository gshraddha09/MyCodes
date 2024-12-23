package com.practice.mylist;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] nums = { 1,1, 1,3, 2 };
		//System.out.println(getCountAfterDuplicated(nums));
//		int n[]=Arrays.copyOfRange(nums, 0, 1);
//System.out.println(n.length);
//		Collections.sort(null);
//		Arrays.sort(nums);
		List<Integer> l = Arrays.asList(100,199,2,3,4,4);
		System.out.println(l.stream());
		
	}

	private static int getCountAfterDuplicated(int[] nums) {
		int j = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[j]) {
				nums[++j] = nums[i];
			}

		}
		int n[]=Arrays.copyOfRange(nums, 0, j+1);
		System.out.println(Arrays.toString(nums));
		return n.length;
	}

}
