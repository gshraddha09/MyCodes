package com.practice.mylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseVowels {

	public static void main(String[] args) {
		String value="hello";
		String reversed="";
		for(int i=value.length()-1;i>=0;i--) {
			reversed+=value.charAt(i);
		}
		System.out.println(reversed);
	}
}