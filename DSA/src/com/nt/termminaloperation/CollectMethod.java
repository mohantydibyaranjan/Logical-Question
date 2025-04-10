package com.nt.termminaloperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectMethod {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(4);
		al.add(22);
		al.add(43);
		al.add(90);
		al.add(31);
		List<Integer> collect = al.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
	}

}
