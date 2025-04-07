package com.nt.bankingprojectlogic;

import java.util.Scanner;

public class PrimaryCardOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 16 digit card number");
		String cardNumber = sc.nextLine().replaceAll("\\s", " ");
		if(cardNumber.length()!=16) {
			System.out.println("Invalid card  number..The card number must have 16 digit");			
		}else {
			char digit12 = cardNumber.charAt(11);
			char digit13 = cardNumber.charAt(12);
			
			if(digit12=='0'&& digit13=='0') {
				System.out.println("Card is invalid");
			}else if(digit12=='0'||digit13=='0') {
				System.out.println("The card is not a primary card");
			}else {
				System.out.println("The card is primary card");
			}
		}
		sc.close();
	}
	

}
