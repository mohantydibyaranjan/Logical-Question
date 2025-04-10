package com.nt.termminaloperation;

import java.util.ArrayList;
import java.util.Optional;

public class ReduceMethod {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(4);
		al.add(22);
		al.add(43);
		al.add(90);
		al.add(31);
		Optional<Integer> reduce = al.stream().reduce((x,y)->x+y);
		System.out.println(reduce);
		
		
		
		
	}

}
