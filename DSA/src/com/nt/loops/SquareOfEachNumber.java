package com.nt.loops;

import java.util.Scanner;

/*
 * 
 * Print the square of each number from 1 to 10 in a column.
 */

public class SquareOfEachNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the fst number");
		int fstNumber = sc.nextInt();
		System.out.println("enter the end number");
		int endNumber = sc.nextInt();
		int num = 0;
		for (int i = fstNumber; i <= endNumber; i++) {
			num = i * i;
			System.out.println(num + " ");

		}
		sc.close();

	}
}
