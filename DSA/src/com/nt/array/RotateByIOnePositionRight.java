package com.nt.array;

/*
 * 
 * Rotate a list to the right by one position (last element moves to the front).
 */
public class RotateByIOnePositionRight {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int end = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = end;
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}

	}

}
