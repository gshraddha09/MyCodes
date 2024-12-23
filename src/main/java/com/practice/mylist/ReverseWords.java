//package com.practice.mylist;
//
//import java.util.Arrays;
//
//public class ReverseWords {
//
//	public static void main(String[] args) {
//		String s = "  a good   example";
//		String[]n=s.trim().split("\\s+");
//		
//		System.out.println(getReverseWords(n));
//	}
//
//	private static String getReverseWords(String s[]) {}
//
////	private static String getReverseWords(String s) {
////
////		
////		s = s.trim().replaceAll("\\s+", " ");
////		int num = s.length();
////		StringBuilder b = new StringBuilder();
////
////		for (int i = s.length() - 1; i >= 0; i--) {
////			if (i == 0) {
////				b.append(s.substring(i, num));
////			}
////			if (s.charAt(i) != ' ') {
////				continue;
////			}
////			if (s.charAt(i) == ' ') {
////				b.append(s.substring(i + 1, num));
////				num = i;
////
////				if (i != 0) {
////					b.append(" ");
////				}
////			}
////
////		}
////		return b.toString();
////	}
//
//}
