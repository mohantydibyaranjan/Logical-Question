package com.nt.loops;

/*Print the following pattern:
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
*/
public class Pattern2 {
	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("ENTER THE FST NUMBER");
//		int startNumber = sc.nextInt();
//		System.out.println("Enetr the ending number");
//		int endingumber = sc.nextInt();
//		for (int i = startNumber; i <= endingumber; i++) {
//			for (int j = startNumber; j <= i; j--) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
//
//		sc.close();
//	}
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
}
