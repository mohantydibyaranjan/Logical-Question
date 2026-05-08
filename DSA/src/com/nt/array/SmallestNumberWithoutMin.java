package com.nt.array;

import java.util.Arrays;
import java.util.List;

/*
 * 
 * 
 * Find and print the smallest number in a list without using min().
 */
public class SmallestNumberWithoutMin {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1, 3, 2, 4, 0, 5, 610);
		int smallest = 0;
		for (int i = 0; i < asList.size(); i++) {
			if (asList.get(i) < smallest) {
				smallest = asList.get(i);
			}
		}
		System.out.println(smallest);

		System.out.println("----------------");
		int[] arr = { 1, 4, 6, 7, 3, 6 };

		int smallest1 = arr[0];
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] < smallest1) {
				smallest = arr[i];
			}

		}
		System.out.println(smallest1);

	}
}
