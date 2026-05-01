package com.nt.loops;

import java.util.Scanner;

/*
 * Print a row of numbers where each row i contains i*i repeated i times.
(Row 1 ® 1, Row 2 ® 4 4, Row 3 ® 9 9 9)
 */
public class RepeatedIIntoI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the fst number");
		int fstNumber = sc.nextInt();
		System.out.println("enter the col");
		int enNum = sc.nextInt();
		// int num = 0;
		for (int i = fstNumber; i <= enNum; i++) {
			for (int j = fstNumber; j <= i; j++) {
				System.out.print((i * i) + " ");
			}
			System.out.println();

		}

		sc.close();

	}

}
