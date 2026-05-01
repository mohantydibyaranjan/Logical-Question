package com.nt.loops;

import java.util.Scanner;

/*
 * 
 * Print all numbers from 1 to 50 but replace multiples of 3 with 'Fizz' and multiples of 5 with
'Buzz'.
 * 
 * 
 */

public class FizzAndBuzz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the fst number");
		int fstNumber = sc.nextInt();
		System.out.println("enter trhe last nUmber");
		int endNumber = sc.nextInt();

		for (int i = fstNumber; i <= endNumber; i++) {
			if (i % 3 == 0) {
				System.out.println("fizz");
			}
			if (i % 5 == 0) {
				System.out.println("BUZZ");

			} else {
				System.out.println(i);
			}

		}
		sc.close();

	}

}
