package com.nt.array;

import java.util.Arrays;
import java.util.List;

/*
 * 
 * 
 * 
 * Find and print the largest number in a list without using max().
 */

public class LargestNumber {
	public static void main(String[] args) {

		int[] arr = { 1, 3, 2, 4, 0, 5, 610 };
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];

			}
		}
		System.out.println(largest);
	}

	// List<Integer> asList = Arrays.asList(1, 3, 2, 4, 0, 5, 610);

//	int largest = 0;
//
//	for(
//	int i = 0;i<asList.size();i++)
//
//	{
//		if (asList.indexOf(i) > largest) {
//			largest = asList.get(i);
//
//		}
//	
//	System.out.println(largest);
//
//}

}
