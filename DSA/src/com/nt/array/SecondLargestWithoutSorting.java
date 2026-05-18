package com.nt.array;

import java.util.Scanner;

public class SecondLargestWithoutSorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.println("enter the Array element");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		int secondLargest = SecondLargestWithoutSorting.secondLargest(arr);
		System.out.println(secondLargest);
		sc.close();

	}

	public static int secondLargest(int[] arr) {

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : arr) {

			if (num > largest) {

				secondLargest = largest;
				largest = num;

			} else if (num > secondLargest && num != largest) {

				secondLargest = num;
			}
		}

		return secondLargest;
	}

}
