package com.nt.dsapattern.twopointer;

import java.util.Scanner;

/*
 * Palindrome Check

Check if a string is palindrome using two pointers.
 */

public class Pallindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		System.out.println(Pallindrome.pallindrome(number));
		sc.close();
	}

	public static boolean pallindrome(int num) {

		String string = String.valueOf(num);
		int left = 0;
		int right = string.length() - 1;

		while (left < right) {
			if (string.charAt(left) != (string.charAt(right))) {
				return false;
			}
			left++;
			right--;
		}

		return true;

	}

}
