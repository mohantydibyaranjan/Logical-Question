package com.nt.loops;

/*
 * 
 * Print a 5×5 matrix where element at row i, col j is i * j.
 */

public class MatrixPrint {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i * j + " ");

			}
			System.out.println();
		}

	}

}
