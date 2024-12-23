package com.practice.mylist;

import java.util.*;

public class BuyAndSellStock {

	public static void main(String[] args) {
		

		int l[] = {7,1,5,3,6,4};
		System.out.println(getprofit(l));
		

	}

	private static int getprofit(int [] l) {
		int min = l[0];
		int index = 0, max = 0;
		for (int i = 1; i < l.length; i++) {
			if (min > l[i]) {
				min = l[i];
				index = i;
            }
		}
		for (int i = index + 1; i < l.length; i++) {
		
			if (max < l[i]) {
				max = l[i];
			}
		}
        return(max-min)>0?(max-min):0;
				
	}

}
