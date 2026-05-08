package com.nt.array;

/*
 * 
 * Calculate and print the sum of all elements in a list without using sum().
 */
public class SumofAllElement {
	public static void main(String[] args) {
		int arr[] = { 1, 4, 6, 7, 3, 6 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}
		System.out.println(sum);
	}

}
