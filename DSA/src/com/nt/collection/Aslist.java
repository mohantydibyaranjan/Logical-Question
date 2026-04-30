package com.nt.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Aslist {
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("Roshan", "jiban", "Akash", "Jilu");
		Collections.sort(asList);
		asList.forEach(System.out::println);

		ListIterator<String> listIterator = asList.listIterator();

		System.out.println("in forward direction");

		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
			System.out.println("----------");

		}

		System.out.println("Backward direction");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		System.out.println("bbbbbbbbb");

		
	}

}
