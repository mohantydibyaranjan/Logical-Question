package com.nt.striver;

public class LargestNumber {
	public static void largest(int[] arr) {
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];

			}

		}
		System.out.println(largest);
	}

	public static void main(String[] args) {

		int[] largestNum = { 2, 4, 7, 8, 1 };
		LargestNumber.largest(largestNum);

	}

}
