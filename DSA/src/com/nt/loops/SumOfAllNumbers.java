package com.nt.loops;

import java.util.Scanner;

public class SumOfAllNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the fst num");
		int fst = sc.nextInt();
		System.out.println("enetr the nth no");
		int nth = sc.nextInt();
		int sum = 0;
		for (int i = fst; i <= nth; i++) {
			sum = sum + i;

			System.out.println(sum);

		}
	}

}
