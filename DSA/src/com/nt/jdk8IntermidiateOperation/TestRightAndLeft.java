package com.nt.jdk8IntermidiateOperation;

public class TestRightAndLeft implements Left,Right {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("my own interface");
		Left.super.m1();
		Right.super.m1();
	}
	public static void main(String[] args) {
		TestRightAndLeft t=new TestRightAndLeft();
		t.m1();
	}
	
	

}
