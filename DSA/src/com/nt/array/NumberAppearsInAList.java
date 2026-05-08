package com.nt.array;

/*
 * 
 * Count how many times a given number appears in a list
 */

public class NumberAppearsInAList {
	public static void main(String[] args) {
//		int arr[] = { 1, 4, 6, 7, 3, 6 };
//		int target = 1;
//		int count = 0;
//		for (int i = 0; i < arr.length - 1; i++) {
//			if (arr[i] == target) {
//				count++;
//			}
//			System.out.println(arr[i]);
//		}
		int arr[] = { 1, 4, 6, 7, 3, 6 };
		boolean[] visited = new boolean[arr.length];
		for (int i = 0; i <= arr.length - 1; i++) {
			if (visited[i] == true) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visited[j] = true;
				}
			}
			System.out.println(arr[i] + " " + count);
		}

	}

}
