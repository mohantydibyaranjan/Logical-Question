package com.nt.problem;
import java.util.Arrays;
import java.util.Scanner;

public class SingleLeftRotateArray {
	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);	
	System.out.println("enter the number of element you wnt to put");
	int length = sc.nextInt();
	int arr[]=new  int[length];
	System.out.println("enter the array");
	for(int i=0;i<length;i++) {
		

	arr[i] = sc.nextInt();
	}
	int[] rotate = rotate(arr);
	System.out.println(Arrays.toString(rotate));
	}
	public static int[] rotate(int arr[]) {
		int length = arr.length;
	int temp=arr[0];
	for(int i=1;i<length;i++) {
		arr[i-1]=arr[i];
		
	}
	arr[length-1]=temp;
		return arr;
	}

}
