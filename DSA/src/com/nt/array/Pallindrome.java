package com.nt.array;

import java.util.Scanner;

public class Pallindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number");
		int number = sc.nextInt();

		System.out.println(Pallindrome.pallindome(number));
		sc.close();

	}

	public static String pallindome(int num) {

		String str = String.valueOf(num);
		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return "Not a Pallindrome";

			}
			left++;
			right--;
		}

		return "Pallindrome";

	}

}
