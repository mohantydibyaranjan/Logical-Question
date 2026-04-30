package com.nt.loops;

import java.util.Scanner;

public class PrintEvery3rdNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the starting number");
		int fstNumber = sc.nextInt();
		System.out.println("enter the 2nd number");
		int endNumber = sc.nextInt();
		int number = 0;
		for (int i = fstNumber; i <= endNumber; i++) {
			i = i + 2;
			System.out.print(i + ",");
		}

	}

}
