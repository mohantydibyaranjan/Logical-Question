package com.nt.loops;

import java.util.Scanner;

public class Print1to100 {
	public static void main(String[] args) {
//		for (int i = 1; i <= 100; i++) {
//			System.out.println("the num,ber is ");
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first num");
		int num1 = sc.nextInt();
		System.out.println("enter the ned no");
		int num100 = sc.nextInt();
		for (int i = num1; i <= num100; i++) {
			System.out.println(i);
		}

	}

}
