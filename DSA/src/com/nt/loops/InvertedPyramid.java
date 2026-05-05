package com.nt.loops;

/*
 * 
 * Print an inverted centred pyramid of stars for n rows.
 */

public class InvertedPyramid {
	public static void main(String[] args) {

		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * (n - i) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
