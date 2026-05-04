//
package com.nt.loops;
///*

// * 

// * 
// * 
// * Print a right-angle triangle aligned to the right side of the page (n=5).
// */
//

public class RightAngleTriangleRightSide {
	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {

			// print spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}

			// print stars
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}
