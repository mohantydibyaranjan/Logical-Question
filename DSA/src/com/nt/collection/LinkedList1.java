package com.nt.collection;

import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args) {
		java.util.LinkedList<String> list = new LinkedList<String>();
		list.add("ERow");
		list.add("Jilu");
		list.add("Roshan");
		list.add("Pawan");
		System.out.println(list);
		list.addFirst("Dibya");
		System.out.println(list);
		list.addLast("Dinesh");
		System.out.println(list);
		list.add(3, "Rakhi");
		System.out.println(list);
		list.set(3, null);
		System.out.println(list);

	}

}
