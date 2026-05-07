package com.nt.loops;

/*
 * 
 * 
 * Print a checkerboard of * and - for a 6×6 grid.F
 */
public class CheckBoard {
	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print("* ");
				} else {
					System.out.print("- ");
				}

			}
			System.out.println();
		}
	}

}
