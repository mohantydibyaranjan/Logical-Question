package com.nt.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * Median of Two Sorted Arrays
Hard
Topics
premium lock icon
Companies
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */

public class MedianofArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// first array size
		System.out.print("Enter size of nums1: ");
		int m = sc.nextInt();

		int[] nums1 = new int[m];

		// first array elements
		System.out.println("Enter nums1 elements:");
		for (int i = 0; i < m; i++) {
			nums1[i] = sc.nextInt();
		}

		// second array size
		System.out.print("Enter size of nums2: ");
		int n = sc.nextInt();

		int[] nums2 = new int[n];

		// second array elements
		System.out.println("Enter nums2 elements:");
		for (int i = 0; i < n; i++) {
			nums2[i] = sc.nextInt();
		}

		MedianofArray obj = new MedianofArray();

		double result = obj.findMedianSortedArrays(nums1, nums2);

		System.out.println("Median = " + result);

		sc.close();
	}

	

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] k = new int[nums1.length + nums2.length];
		int index = 0;
		for (int i = 0; i <= nums1.length - 1; i++) {
			k[index] = nums1[i];
			index++;

		}
		for (int i = 0; i <= nums2.length - 1; i++) {
			k[index] = nums2[i];
			index++;

		}
		Arrays.sort(k);
		int length = k.length;
		if (length % 2 == 1) {
			return k[length / 2];
		}

		return ((double) k[length / 2] + k[(length / 2) - 1]) / 2;

	}

}
