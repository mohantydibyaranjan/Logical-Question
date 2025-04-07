package com.nt.bankingprojectlogic;

import java.util.Scanner;

public class ToHideLastDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter thr 12 digit number");
	   String CardNumber = sc.nextLine();
		if( CardNumber.length() ==12) {
		String maskedCardNumber=	"XXXXXXXX"+CardNumber.substring(8);
		System.out.println("masked card number is "+maskedCardNumber);

			
		}else {
			System.out.println("invalid card number");
		}
		sc.close();
	
	}


}
