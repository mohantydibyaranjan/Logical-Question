package com.nt.jdk8IntermidiateOperation;

import java.util.ArrayList;

public class LimitMethod {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Dibya");
		al.add("Akash");
		al.add("Rsju");
		al.add("Ramesh");
		al.add("Hari");
		
		al.stream().skip(2).limit(3).forEach(System.out::println);
		al.stream().limit(2).skip(2).forEach(System.out::println);
		
	}

}
