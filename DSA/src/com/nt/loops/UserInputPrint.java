package com.nt.loops;

import java.util.Scanner;

/*
 * 
 * Print each letter of a user-input word on a new line, preceded by its position number.
 */
public class UserInputPrint {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Word");

		String word = sc.next();
		for (int i = 0; i < word.length(); i++) {
			System.out.println(i + 1 + " " + word.charAt(i));

		}
		sc.close();

	}

}
