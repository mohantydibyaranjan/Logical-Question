package com.nt.loops;

import java.util.Scanner;

/*'
 * 
 * Print an inverted right-angle triangle of stars (n=6, stars shrink).
 */

public class InvertedRightAngleTriangle {
	public static void main(String[] args) {
//		for (int i = 1; i <= 6; i++) {
//			for (int j = 1; j <= 6 - i + 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		for (int i = 1; i <= 6; i++) {
//			for (int j = 1; j <= 6 - i + 1; j++) {
//				System.out.print(j + "");
//			}
//			System.out.println();
//		}

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the start number");
		int fstnum = sc.nextInt();
		System.out.println("enter the end Number");
		int endNumber = sc.nextInt();
		for (int i = fstnum; i <= endNumber; i++) {
			for (int j = fstnum; j <= endNumber - i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
		sc.close();

	}

}
