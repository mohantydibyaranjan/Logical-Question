package com.nt.problem;

import java.util.Scanner;
public class ThreeRotateArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array `size");
		int length = sc.nextInt();
		int arr[]=new int[length];
		System.out.println("enter the array");
		for(int i=0;i<length;i++) {
	     arr[i] = sc.nextInt();	
		}
		System.out.println("enter the rotaion the array you wnt");
		int d = sc.nextInt();
		threeRotateArray(arr, length, d);
		System.out.println("after the rotate array");
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}
	//Method to rotate the array by d positions
	public static 	void reverse(int arr[],int start,int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}	
	}
	public static void threeRotateArray(int arr[],int n,int d) {		
	d=d%n;//// To handle cases where d > n
	reverse(arr, 0, n-1);// Reverse the entire array
	reverse(arr, 0, d-1);//   Reverse the first part (0 to d-1)
	
	
	}}