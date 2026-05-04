package com.nt.loops;

import java.util.Scanner;
/*
 * 
 * 
 * Print all two-digit numbers where the sum of digits equals 9.
 */

public class SumdigitisNine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the start number");
		int fst = sc.nextInt();
		System.out.println("enter the end number");
		int end = sc.nextInt();
		int sum = 0;

		for (int i = fst; i <= end; i++) {
			if (i >= 9 && i <= 99) {
				sum = (i % 10) + (i / 10);
				if (sum == 9) {
					System.out.println(i);
				}

			}
			sc.close();

		}

	}

}
