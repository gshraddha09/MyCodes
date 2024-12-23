package com.practice.october;

public class MaxofSubArraySizeK {

	public static void main(String[] args) {
		//            0   1    2   3   4
		int[] arr = { 20, 10, 30, 40, 10 };
		//                 i
		//                     j
		//            
		int result[] = findMaxElementOfSubArraySizeK(arr, 2);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}

	private static int[] findMaxElementOfSubArraySizeK(int[] arr, int k) {
		int[] result = new int[arr.length-k+1];
		int maxNum = 0;
		for (int i = 0; i <= arr.length - k; i++) {
			for (int j = i + 1; j < i+k; j++) {
				maxNum = Math.max(arr[i], arr[j]);

			}
			result[i] = maxNum;
		}
		return result;

	}

}
