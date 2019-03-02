package com.exam;

import java.util.Scanner;

 class FixedAccount {
	void calculateInterest(){
		Scanner in=new Scanner(System.in);
		float principle,Interest;
		float RATEOFINTERST=5;
		int days;
		
		System.out.println("enter principle amount");
		principle=in.nextFloat();
		
		//System.out.println("enter Interest amount");
		//rateOfInterest=in.nextFloat();
		
		System.out.println("enter no.days");
		days=in.nextInt();
		
		Interest=((principle*days*RATEOFINTERST)/100);
		
		System.out.println("the interest for fixed account is :"+Interest);
		
		
	}
}


 class SavingsAccount extends FixedAccount{
	void calculateInterest(){
		Scanner in=new Scanner(System.in);
		float principle,Interest;
		int days;
		float RATEOFINTERST=8;
		
		System.out.println("enter principle amount");
		principle=in.nextFloat();
		
		System.out.println("enter no.days");
		days=in.nextInt();
		
		System.out.println("interest rate is fixed here and it is 8");
		
		Interest=((principle*days*RATEOFINTERST)/100);
		
		System.out.println("the interest for savings account is rs:"+Interest);
		
		
	}
}
 
 
 public class CalculateInterest{
	 public static void main(String args[]){
		 SavingsAccount savings=new SavingsAccount();
		 
		 savings.calculateInterest();
	 }
 }