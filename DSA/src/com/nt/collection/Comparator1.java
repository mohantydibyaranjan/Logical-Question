package com.nt.collection;

import java.util.TreeSet;

public class Comparator1 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>(new MyComparator());
		ts.add(43);
		ts.add(13);
		ts.add(45);
		ts.add(29);
		ts.add(34);
		System.out.println(ts);
	}

}
