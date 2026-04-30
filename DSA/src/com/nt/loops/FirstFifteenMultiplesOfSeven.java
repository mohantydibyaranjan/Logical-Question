package com.nt.loops;

import java.util.Scanner;

public class FirstFifteenMultiplesOfSeven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int number = sc.nextInt();
		System.out.println("enter the fst number");
		int stsrtNumber = sc.nextInt();
		System.out.println("enter the end Number");
		int endNumber = sc.nextInt();
		int num = 0;
		for (int i = stsrtNumber; i <= endNumber; i++) {
			num = number * i;

			System.out.println(num);

		}
		sc.close();

	}

}
