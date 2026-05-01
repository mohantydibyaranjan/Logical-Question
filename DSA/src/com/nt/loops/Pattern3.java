package com.nt.loops;

/*Print the following pattern (repeated digit per row):
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
*/
public class Pattern3 {
	public static void main(String[] args) {
		for (int i = 1; i >= 1; i++) {
			for (int j = i; j >= i; j++) {
				System.out.print(j + "");
			}
			System.out.println();
		}
	}

}
