package com.practice.mylist;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3 ,4};
		int k=5;
		RotateArray(nums,k);
		System.out.println(Arrays.toString(nums));

	}

	private static void RotateArray(int[] nums,int k) {
		k=k%(nums.length);

		ShiftNumbers(nums, 0, nums.length - 1);
		ShiftNumbers(nums, 0, k-1);
		ShiftNumbers(nums, k, nums.length-1);
	}

	private static void ShiftNumbers(int[] nums, int left, int right) {
		while(left<right) {
			int temp=nums[left];
			nums[left]=nums[right];
			nums[right]=temp;
			left++;
			right--;
			
		}
	}

}
