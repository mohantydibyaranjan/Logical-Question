package com.nt.loops;

/*
 * 
 * Print a triangle where each row shows the ASCII value of the letter on that row.
 */
public class ShowInASCIIValue {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			char ch = (char) ('A' + i - 1);
			for (int j = 1; j <= i; j++) {
				System.out.print((int) ch + " ");
			}
			System.out.println();
		}
	}

}
