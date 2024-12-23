package com.practice.mylist;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
	public static void main(String[] args) {
		System.out.println("Prime numbers between 1 and 10 are:");
		for (int i = 2; i <= 10; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}
}
