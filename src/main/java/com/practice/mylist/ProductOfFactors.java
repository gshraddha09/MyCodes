package com.practice.mylist;

import java.util.List;
import java.util.Scanner;

public class ProductOfFactors {
	public static void main(String[] args) {
	
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int result=FindProductFactors(n);
		
		System.out.println((int)(result%((Math.pow(10,9))+7)));
	}

	private static int FindProductFactors(int n) {
		int sumOfProducts=1;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				sumOfProducts*=i;
			}
		}
		return sumOfProducts;
	}


}
