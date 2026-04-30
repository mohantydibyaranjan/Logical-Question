package com.nt.striver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

//
public class SlargestAndsSmallestNumberInArray {
//	public static void main(String[] args) {
//		
//	}
//	
//
//
//}
//public static void sLargest(int []num) {
//	{
//		int sLargest=a[0];
//		
//	}
//}

//	public static void main(String[] args) {
//		String s = "java developer";
//		Predicate<String> isNotEmpty = str -> !str.isEmpty();
//
//		boolean test = isNotEmpty.test(s);
//		System.out.println(" IS input not empty" + s + "" + test);
//		Predicate<String> isEmpty = isNotEmpty.negate();
//		String emptyInput = "";
//		System.out.println("is" + emptyInput + "empty" + isEmpty.test(emptyInput));
//
//	}

	public static void main(String[] args) {
		List<String> ss = new ArrayList<String>();
		ss.add("Apple");
		ss.add("orange");
		ss.add("grapes");
		ss.add("Green Apple");
		ss.forEach(s -> System.out.println(s.toCharArray()));
		System.out.println(";;;;;;;;;;;;;;;;;;;;;;;");
		Collections.sort(ss);
		ss.forEach(System.out::println);

		System.out.println(";;;;;;;;;;;;;;;;;;");
		Collections.reverse(ss);
		ss.forEach(System.out::println);
		System.out.println("........................");

		ss.remove(3);
		System.out.println(ss.toString());
		ss.forEach(System.out::println);
		ss.remove("Green Apple");
		ss.forEach(System.out::println);

	}

}