package com.nt.array;

/*
 * 
 * Print all elements of a list in reverse order without using reverse() or slicing.
 */
public class PrintInReverseOrder {
	public static void main(String[] args) {
		int arr[] = { 1, 4, 6, 7, 3, 6 };
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

}
