package com.nt.loops;

import java.util.Scanner;

public class CountDigit31To100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fst num");
		int fstNum = sc.nextInt();
		System.out.println("Enter the endNum");
		int endNum = sc.nextInt();
		System.out.println("enter the num you want check how many tiomes it comes");
		int appNum = sc.nextInt();

		int count = 0;
		for (int i = fstNum; i <= endNum; i++) {

			appNum = i;
			while (appNum > 0) {
				if (appNum % 10 == 3) {
					count++;
				}
				appNum = appNum / 10;
			}

		}
		System.out.println("total number of digit in count 3 is " + count);
		sc.close();
	}

}
