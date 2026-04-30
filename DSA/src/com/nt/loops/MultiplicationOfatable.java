package com.nt.loops;

import java.util.Scanner;

public class MultiplicationOfatable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int mul = 0;
		for (int i = 1; i <= 10; i++) {
			mul = num * i;
			System.out.println(mul);
		}

	}

}
