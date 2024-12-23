package com.practice.mylist;

import java.util.Arrays;

public class RemoveElement {
	public static int removeElementCount(int[] nums, int val) {

		// int[] nums1 = new int[nums.length];
		int count = 0, j = 0;
		for (int i = 0; i <= nums.length - 1; i++) {
			if (val != nums[i]) {
				nums[j] = nums[i];
				j++;
				count++;
			}
		}

		// System.out.println("------");
		nums = Arrays.copyOfRange(nums, 0, j);
		System.out.println(Arrays.toString(nums));
		return count;

	}

	public static void main(String args[]) {
		int[] n = { 0, 1, 3, 2, 4, 3 };
		int count = removeElementCount(n, 2);
		System.out.println(count);

	}

}
