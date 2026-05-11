package com.nt.dsapattern.twopointer;

import java.util.Scanner;

/*
 * 
 * 
 * Reverse an Array Using Two Pointers
Example
[1,2,3,4]

Output:

[4,3,2,1]
 */

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("entre the Array element");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();

		}
		int[] reverse = ReverseArray.reverse(arr);
		for (int num : reverse) {
			System.out.println(num);
		}
		sc.close();
	}

	public static int[] reverse(int arr[]) {
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int reverse = arr[left];
			arr[left] = arr[right];
			arr[right] = reverse;
			left++;
			right--;
		}

		return arr;

	}

}
