package com.practice.october;

import java.util.Arrays;

public class LongestSubArrayOfSizeK {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,10};
		System.out.println("sum is" + findSubArraySizeK(arr, 2));
	}

	public static int findSubArraySizeK(int[] arr, int k) {

//		int len = arr.length;
//		int start = 0, end = 0, i, j;
//		if (len < k) {
//			System.out.println("array length is small then Window size");
//		}
//		int sum = 0, maxSum = 0;
//		for (i = 0; i <= len - k; i++) {
//			sum = 0;
//			for (j = i; j < i + k; j++) {
//				sum += arr[j];
//			}
//			if (max < sum) {
//				max = sum;
//			start = i;
//			end = j-1;
//			}
//
//		}
//		for (int m = start; m <= end; m++)
//			System.out.println(arr[m]);
//      10 20 30 40 50 cs30
		int currentSum = 0;
		int maxSum = 0;
		for (int i = 0; i < k; i++) {
			currentSum += arr[i];

		}
		maxSum = currentSum;
		for (int i = k; i < arr.length; i++) {
			currentSum += arr[i] - arr[i - k];
			maxSum = Math.max(maxSum, currentSum);
		}
		
		return maxSum;

	}

}
