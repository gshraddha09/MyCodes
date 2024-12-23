package com.practice.october;

import java.util.ArrayList;
import java.util.List;

public final class LongestSubarrayofSumK {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 20, 40, 30, 50 };
		findSubArraySumK(arr, 70);
		// 10 20 30 20 40 30 50 sum 70
		// i
		// j
	}

	private static void findSubArraySumK(int[] arr, int k) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer>array=new ArrayList<>();
		int i, j, sum = 0, start = 0, end = 0, maxlen = 0;
		for (i = 0; i <= arr.length - 1; i++) {
			sum = 0;
			for (j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum == k && maxlen < j - i + 1) {
					start = i;
					end = j;
					maxlen = j - i + 1;
				}

			}
		}
//		for(int m=start;m<=end;m++) {
//			System.out.print(arr[m]+" ");
//		}

	}
}
