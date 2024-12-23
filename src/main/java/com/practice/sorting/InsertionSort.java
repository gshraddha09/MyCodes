package com.practice.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 2,1,4,1 };
	
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i], temp = 0;
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;

		}
		System.out.println(Arrays.toString(arr));

	}
	

}
	
	
	
	
	
	
	
	
	


