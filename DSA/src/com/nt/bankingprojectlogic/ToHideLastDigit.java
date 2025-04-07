package com.nt.bankingprojectlogic;

import java.util.Scanner;

public class ToHideLastDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter thr 16 digit number");
	   String CardNumber = sc.nextLine();
		if( CardNumber.length() ==16) {
		String maskedCardNumber=	"XXXX XXXX XXXX "+CardNumber.substring(12);
		System.out.println("masked card number is "+maskedCardNumber);

			
		}else {
			System.out.println("invalid card number ");
		}
		sc.close();
	
	}


}
