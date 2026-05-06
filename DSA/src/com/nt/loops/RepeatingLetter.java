package com.nt.loops;
/*
 * 
 * Print the following pattern (each row repeats its letter):
A
B B
C C C
D D D D
 */

public class RepeatingLetter {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			char ch = (char) ('A' + i - 1);
			for (char j = 1; j <= i; j++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}

}
