package com.nt.termminaloperation;

import java.util.ArrayList;

public class ToArrayMethod {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(4);
		al.add(22);
		al.add(43);
		al.add(90);
		al.add(31);
		Object[] objects = al.stream().toArray();
		for(Object o:objects) {
			System.out.println(o);
		}
		
	}

}
