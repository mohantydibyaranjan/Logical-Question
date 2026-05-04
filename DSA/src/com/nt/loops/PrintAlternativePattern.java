package com.nt.loops;

import java.util.Scanner;

/*
 * 
 * Print an alternating pattern of 0s and 1s for n rows:
Row 1 ® 1 0 1 0 1
Row 2 ® 0 1 0 1 0
 */
public class PrintAlternativePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the fst number");
		int rows = sc.nextInt();
		System.out.println("Enter the 2nd Number");
		int column = sc.nextInt();

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= column; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();

		}
		sc.close();

	}

}
