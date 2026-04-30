package com.nt.loops;

import java.util.Scanner;

public class PrintOddBetwnne1to50 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE FST NUMBER");
		int fstno = sc.nextInt();
		System.out.println("enter the end no");
		int endNumber = sc.nextInt();

		for (int i = fstno; i <= endNumber; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}
