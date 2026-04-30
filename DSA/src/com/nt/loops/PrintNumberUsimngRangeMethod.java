package com.nt.loops;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrintNumberUsimngRangeMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 1st num");
		int num100 = sc.nextInt();
		System.out.println("enetr the ned numbetr");
		int num1 = sc.nextInt();
		for (int i = num100; i >= num1; i--) {
			System.out.println(i);

		}
		System.out.println("------------");
		IntStream.range(num100, num1).map(i -> 100 - i).forEach(System.out::println);
		sc.close();

	}

}
