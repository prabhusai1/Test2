package com.exam;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String args[]){
		largestNumber();
	}
	
	public static void largestNumber(){
		Scanner in=new Scanner(System.in);
		
		System.out.println("please enter a number which is greater than 10");
		int number=in.nextInt();
		
		int temp=number%10;
		temp=temp+1;
		
		number=number-temp;
		
		System.out.println("the number that satisfies the conditions is :"+ number);
	}
}
