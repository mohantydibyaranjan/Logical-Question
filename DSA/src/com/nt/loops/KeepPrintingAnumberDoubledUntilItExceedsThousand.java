package com.nt.loops;

import java.util.Scanner;

public class KeepPrintingAnumberDoubledUntilItExceedsThousand {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		while (number < 1000) {
			System.out.println(number);
			number = number * 2;
		}
		sc.close();

	}

}
