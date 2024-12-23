package com.practice.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 3, 2, 4,6 };
		getSorting(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static int[] getSorting(int[] arr) {
		boolean isSwapped = false;
		for (int i = 0; i < arr.length-1; i++) {
			isSwapped = false;
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSwapped = true;
					System.out.println("for i "+i+" for j "+j+"--> "+Arrays.toString(arr));
				}

			}
			if (!isSwapped) {
				return arr;
			}
		}
		return arr;
	}
	
	
	
	
	

}
