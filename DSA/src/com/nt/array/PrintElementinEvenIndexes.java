package com.nt.array;

/*
 * 
 * 
 * Print only the elements at even indexes (0, 2, 4 …) of a list.
 */
public class PrintElementinEvenIndexes {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int length = arr.length - 1;
		for (int i = 0; i <= length; i++) {
			if (i % 2 == 0) {
				System.out.println(arr[i] + " " + i);

			}
		}

	}

}
