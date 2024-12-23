package com.practice.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {

	public static void main(String[] args) {
		// first ele minIndex ele fix --i
		// j =i+1 after j to n find minIndex with i swap if greater

		int[] num = { 2,1,4,1};
		int minIndex=-1;
		for (int i = 0; i < num.length-1; i++) {
			minIndex=i;
			for(int j=i+1;j<num.length;j++) {
				if(num[minIndex]>num[j]) {
					minIndex=j;
				}
				System.out.println("In loop for i and j "+i+" "+j+Arrays.toString(num));
			}
			int temp=num[minIndex];
			num[minIndex]=num[i];
			num[i]=temp;

		}
		System.out.println(Arrays.toString(num));
		
		
		
		
		
		//0 1 2 3 4-index
		//1 2 3 4 5-array
		//      i
		//        j
		  
		//related to I  minIndex=4
				
				
	}
	
	
	

}
