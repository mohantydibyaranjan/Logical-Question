package com.nt.loops;

import java.util.Scanner;

/*
 * 
 * Print the running total after each number: 1, 3, 6, 10, 15 … up to n=10.
 */

public class RunningTotalSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fst number");
		int fstNumber = sc.nextInt();
		System.out.println("Entre the end numbver");
		int endNumber = sc.nextInt();
		int sum = 0;
		for (int i = fstNumber; i <= endNumber; i++) {
			sum = sum + i;
			System.out.println(sum);

		}
		sc.close();
	}

}
