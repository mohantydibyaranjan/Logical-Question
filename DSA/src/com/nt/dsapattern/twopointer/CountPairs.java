package com.nt.dsapattern.twopointer;

/*
 * 
 * Count Pairs

Count how many pairs equal target.
 * 
 */
public class CountPairs {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int target = 7;
		System.out.println(countPairs(arr, target));

	}

	public static int countPairs(int arr[], int target) {
		int left = 0;
		int right = arr.length - 1;
		int count = 0;
		while (left < right) {
			int sum = arr[left] + arr[right];
			if (sum == target) {
				count++;
				left++;
				right--;

			} else if (sum < target) {
				left++;
			} else {
				right--;
			}

			// System.out.println();

		}

		return count;

	}

}
