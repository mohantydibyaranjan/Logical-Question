package com.nt.loops;

/*
 * 
 * Print all pairs (i, j) where i + j == 10, for i in range 1–9.
 */
public class PrintAllPairs {
	public static void main(String[] args) {
		int n = 9;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i + j == 10) {
					System.out.println(i + " " + j);
				}
			}

		}
	}

}
