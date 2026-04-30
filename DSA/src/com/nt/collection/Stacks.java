package com.nt.collection;

import java.util.Stack;

public class Stacks {
	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.push("Roshan");
		st.push("Dibya");
		st.push("Dinesh");
		st.push("Akhil");
		st.push("Mohanty");
		System.out.println(st);
		st.pop();
		System.out.println(st);
		st.pop();
		System.out.println(st);
		st.peek();
		System.out.println(st);

	}

}
