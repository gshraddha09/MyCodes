package com.practice.mylist;

import java.util.HashSet;

public class ContinousSubarrayOfK {
	public static void main(String[] args) {
		int nums[] = { 1, 1, 7, 8, 9 };

		int k = 3;
		long v = getContinousSubArrayofK(nums, k);
		System.out.println(v);
	}

	private static long getContinousSubArrayofK(int[] nums, int k) {
		int i = 0, j = k - 1, sum = 0;
		long max = 0;
		//1 1 7 8 9
		while (i <=(nums.length - k)) {
			HashSet<Integer> uniqueElements = new HashSet<>();
			sum=0;
			for (int m = i; m <= j; m++) {
				if (uniqueElements.contains(nums[m])) {
					sum = 0; // If duplicate found, reset sum
					break;
				}
				uniqueElements.add(nums[m]);
				sum += nums[m];
			}
			if (max < sum) {
				max = sum;

			}
			
			i++;
			j++;
		}
		return max;

	}
}
