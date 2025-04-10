package com.nt.jdk8IntermidiateOperation;

import java.util.ArrayList;

public class RemoveDuplicate {
	public static void main(String[] args) {
		ArrayList<String> al=new  ArrayList<String>();
		al.add("Roshan");
	al.add("Dibya");
	al.add("Roshan");
	al.add(null);
	al.add("Akash");
	al.add("Raghav");
	al.add("Dibya");
	
	al.stream().distinct().filter(x->x!=null).forEach(System.out::println  );
	}

}
