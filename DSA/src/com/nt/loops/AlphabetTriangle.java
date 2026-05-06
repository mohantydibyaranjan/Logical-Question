package com.nt.loops;

/*
 * 
 * Print a mirrored alphabet triangle:
A B C D E
A B C D
A B C
A B
A
 */
public class AlphabetTriangle {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (char j = 'A'; j < 'A' + (n - i + 1); j++) {

				System.out.print(j + "");

			}
			System.out.println();
		}
	}

}
