//package com.practice.mylist;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Set;
//import java.util.TreeSet;
//
//public class SummaryRange {
//	public static void main(String args[]) {
//		//             0  1  2  3  4  5
//		int nums[] = {0,2,3,4,6,8,9};
//		//                            i  j
////		List<String> result = getrange(nums);
//		SummaryRange sr= new SummaryRange();
//		sr.getRange1(nums);
////		System.out.println(result);
//
//	}
//
//
//	public static List<String> getrange(int[] nums) {
//
//		List<String> l = new ArrayList<>();
//		int i = 0, j = 1, index = nums[0];
//		while (i < nums.length) {
//
//			if (i == nums.length - 1) {
//
//			} else if (nums[i] + 1 == nums[j]) {
//				i++;
//				j++;
//
//			} else {
//				l.add(index + "->" + nums[i]);
//				index = nums[j];// index=7
//				i++;
//				j++;
//
//			}
//		}
//		return l;
//
//	}
//	
////	void getRange1(int[] nums) {
////		List<String> res = new ArrayList<>();
////		int num = nums[0];
////		StringBuilder s = new StringBuilder();
////		s.append(nums[0]);
////		for(int i=1;i<nums.length;i++) {
////			if(nums[i] != nums[i-1] + 1) {
////				if(num != nums[i-1]) {					
////					s.append("->");
////					s.append(nums[i-1]);
////				}
////				res.add(s.toString());
////				s=new StringBuilder();
////				s.append(nums[i]);
////				num = nums[i];
////			}
////		}
////		if(num != nums[nums.length-1]) {
////			s.append("->");
////			s.append(nums[nums.length-1]);
////		}
////		res.add(s.toString());
////		System.out.println(res);
////	}
//
//}
