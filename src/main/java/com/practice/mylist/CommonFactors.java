package com.practice.mylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommonFactors {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

		System.out.println(commonFactors(a, b));
	}

	private static int commonFactors(int a, int b) {
		int c = 0;

		for (int i = 1; i <= Math.min(a, b); i++) {
			if (a % i == b % i) {
				c++;
			}
		}
		return c;
	}

}
