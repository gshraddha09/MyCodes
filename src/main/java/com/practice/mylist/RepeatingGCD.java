package com.practice.mylist;

import java.util.Scanner;

public class RepeatingGCD {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A, B;
		int n = 3, x = 2, y = 5;
		//A=22 B=22222
		A = GetRepeatingAandB(n, x);
		B = GetRepeatingAandB(n, y);
		System.out.println(GCD(A, B));

	}

	private static int GCD(int a, int b) {
		int maxGcd = 1;
		for (int i = 1; i <= Math.min(a, b); i++) {

			if (a % i == 0 && b % i == 0) {
				if (maxGcd < i) {
					maxGcd = i;
				}
			}
		}
		return maxGcd;

	}

	private static int GetRepeatingAandB(int n, int val) {
		int sum = n;
		while (val != 1) {
			sum = sum * 10 + n;
			val--;
		}
		return sum;
	}

}
