package com.nt.jdk8IntermidiateOperation;

import java.util.Arrays;

public class EvenOrOdd {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number");
//		int number = sc.nextInt();
//	IntStream.of(number).forEach(num->{
//		String result=(num>x%2==0)?"even":"odd";
//		System.out.println(result);
//	});
//		
//	}

//}
		
		int[] arr= {20,30,40,50,35};
		
		Arrays.stream(arr).filter(x->x%2==0).forEach(System.out::println);
		
	}}
