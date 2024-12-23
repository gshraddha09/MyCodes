package com.practice.october;

import java.util.Map;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int num[] = { 2, 7, 11, 15 };
		int target = 9;
//		for(int i=0;i<num.length;i++) {
//			for(int j=i+1;j<num.length;j++) {
//				if( num[i]<=num[j]&&num[i]+num[j]==target) {
//					System.out.println(i+" "+j);
//				}
//			}
//		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < num.length; i++) {
			int val=target - num[i];
			if (map.containsKey(val)) {
				System.out.println("index from "+map.get(val)+" to "+i);

			} else {
				map.put(num[i],i);
			}

		}
	}

}
