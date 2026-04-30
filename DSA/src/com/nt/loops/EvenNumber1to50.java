package com.nt.loops;

import java.util.Scanner;

public class EvenNumber1to50 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the fst number");
		int fstNum = sc.nextInt();
		System.out.println("Enter the 2nd number");
		int endNum = sc.nextInt();
		for (int i = fstNum; i <= endNum; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
