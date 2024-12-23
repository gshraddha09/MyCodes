package com.practice.mylist;

import java.util.*;

public class GoldmanSachsInterviewQuestion {

	// Method to find the square root of a non-perfect square number using
	// Newton-Raphson
	public static double sqrt(double number) {
		if (number < 0) {
			throw new IllegalArgumentException("Cannot compute square root of a negative number.");
		}
		if (number == 0) {
			return 0;
		}

		// Initial guess
		double CE = number;
		double epsilon = 0.001; // Precision
		while (true) {
			double nextG = CE - ((CE * CE - number) / (2 * CE));
			if (Math.abs(nextG - CE) < 0.001) {
				return CE;
			}
			CE = nextG;
		}

	}

	public static void main(String[] args) {
		double number = 100; // Example non-perfect square
		double result = sqrt(number);
		System.out.println("Square root of " + number + " is approximately " + result);

	}

}
