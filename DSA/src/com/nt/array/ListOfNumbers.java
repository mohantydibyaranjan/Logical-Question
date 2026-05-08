package com.nt.array;

import java.util.Arrays;
import java.util.List;

/*
 * 
 * 
 * Create a list of 5 numbers and print each element using a for loop
 */

public class ListOfNumbers {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 6, 7, 3, 6 };
		List<Integer> asList = Arrays.asList(1, 4, 6, 7, 3, 6);
		for (int i = 0; i < asList.size(); i++) {
			System.out.print(asList.get(i));
		}
		System.out.println();

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i]);
		}
	}

}
