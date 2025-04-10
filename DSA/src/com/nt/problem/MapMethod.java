package com.nt.problem;

import java.util.ArrayList;

public class MapMethod {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Roshan");
		al.add("Dibya");
		al.add("Satya");
		al.add("kunu");
		al.add("kunu");
		al.stream().distinct().map(x->x.toUpperCase()).sorted().forEach(System.out::println);
	}

}
