package com.nt.array;
/*
 * 
 * . Container With Most Water
Solved
Medium
Topics
premium lock icon
Companies
Hint
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

 

Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
 */

import java.util.Scanner;

public class ContainerWithMostWater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE ARRAY SIZE");
		int length = sc.nextInt();
		int arr[] = new int[length];
		System.out.println("enter the array element");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		ContainerWithMostWater cw = new ContainerWithMostWater();
		int maxArea = cw.maxArea(arr);
		System.out.println(maxArea);
		sc.close();

	}

	public int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int maxWater = 0;
		while (left < right) {
			int width = right - left;
			int min = Math.min(height[right], height[left]);
			int area = width * min;
			maxWater = Math.max(maxWater, area);
			if (height[left] < height[right]) {
				left++;

			} else {
				right--;
			}
		}
		return maxWater;
	}

}
