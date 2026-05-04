package com.nt.loops;

import java.util.Scanner;

public class RightAngleTrianglePrintStar {
	public static void main(String[] args) {
//		for (int i = 1; i <= 6; i++) {
//			for (int j = 1; j < i + 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the start number");
		int fstNumber = sc.nextInt();
		System.out.println("enter the endNumber");
		int endNumber = sc.nextInt();
		for (int i = fstNumber; i <= endNumber; i++) {
			for (int j = fstNumber; j < i + 1; j++) {
				System.out.print("*");

			}
			System.out.println();

		}
		sc.close();

	}

}
