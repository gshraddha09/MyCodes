package com.practice.mylist;

import java.util.Scanner;

public class GcdAndLcm {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int gcd = findGCD(a, b);
		System.out.println((a+b)/gcd);
		System.out.println(gcd);
	}

	private static int findGCD(int a, int b) {
		int max=1;
		for(int i=1;i<=Math.min(a, b);i++) {
			if(a%i==0&& b%i==0) {
			if(max<i) {
				max=i;
			}
		}
		}
		return max;
	}

}
