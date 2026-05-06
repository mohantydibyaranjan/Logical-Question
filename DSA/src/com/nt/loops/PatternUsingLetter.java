package com.nt.loops;

/*
 * 
 * 
 * Print the following pattern using letters:
A
A B
A B C
A B C D
 */

public class PatternUsingLetter {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (char j = 'A'; j < 'A' + i; j++) {
				System.out.print(j + " ");

			}
			System.out.println();
		}
	}

}
