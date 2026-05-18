package com.nt.dsapattern.twopointer;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * 
 * 
Code
Testcase
Testcase
Test Result
16. 3Sum Closest
Solved
Medium
Topics
premium lock icon
Companies
Given an integer array nums of length n and an integer target, find three integers at distinct indices in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

 

Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
 

Constraints:

3 <= nums.length <= 500
-1000 <= nums[i] <= 1000
-104 <= target <= 104
 */

public class ThreeSumClosest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int length = sc.nextInt();
		int arr[] = new int[length];
		System.out.println("Enter teh Array Element");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		ThreeSumClosest tsc = new ThreeSumClosest();
		int threeSumClosest = tsc.threeSumClosest(arr, length);
		System.out.println(threeSumClosest);
		sc.close();

	}

	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int n = nums.length;
		int diff = Integer.MAX_VALUE;
		int resSum = 0;
		for (int i = 0; i < n - 2; i++) {
			int left = i + 1;
			int right = n - 1;
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				int d = Math.abs(target - sum);
				if (d < diff) {
					diff = d;
					resSum = sum;
				}
				if (sum == target) {
					return resSum;
				} else if (sum < target) {
					left++;
				} else {
					right--;
				}
			}
		}

		return resSum;

	}

}
