package com.nt.array;

/*
 * 
 * 
 * Merge two lists into one and print the combined list.
 */
public class MergeTwoList {
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4 };
		int arr2[] = { 5, 6, 7, 8 };
		int merged[] = new int[arr1.length + arr2.length];
		int k = 0;
		for (int i = 0; i <= arr1.length - 1; i++) {
			merged[k] = arr1[i];
			k++;
		}
		for (int j = 0; j <= arr2.length - 1; j++) {
			merged[k] = arr2[j];
			k++;
		}
		for (int num : merged) {
			System.out.println(num);
		}
	}

}
