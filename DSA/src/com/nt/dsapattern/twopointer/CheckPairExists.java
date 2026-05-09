package com.nt.dsapattern.twopointer;

/*
 * 
 * Check Pair Exists

Return true if any pair equals target.
 */
public class CheckPairExists {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 6, 6 };
		int target = 7;
		System.out.println(CheckPairExists.sum(arr, target));

	}

	public static boolean sum(int arr[], int target) {
		int right = arr.length - 1;
		int left = 0;
		while (left < right) {
			int sum = arr[right] + arr[left];
			if (sum == target) {
				return true;

			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}

		return false;

	}

}
