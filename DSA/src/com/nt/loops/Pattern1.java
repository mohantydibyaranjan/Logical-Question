package com.nt.loops;

import java.util.Scanner;

/*Print the following pattern:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/
public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enyter the start row");
		int startNum = sc.nextInt();
		System.out.println("enter the Column");
		int endNum = sc.nextInt();

		for (int i = startNum; i <= endNum; i++) {
			for (int j = startNum; j <= i; j++) {

				System.out.print(j + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
