package com.exam;

import java.util.Scanner;

class AgeException extends Exception{
	public AgeException(String s) {
		System.out.println(s);
	}
}

public class EmployeeDetails {
	public static void main(String args[]) throws AgeException{
		employeeDetails();
	}
	
	public static void employeeDetails() throws AgeException{
		Scanner in=new Scanner(System.in);
		
		System.out.println("please enter your name");
		String name=in.next();
		
		System.out.println("please enter your contact number");
		long number=in.nextLong();
		
		System.out.println("please enter your age");
		int age=in.nextInt();
		
		System.out.println("your details are accepted");
		
		if(age<20 || age>55){
			throw new AgeException(" Age exception is raised and your age is not eligible....sorry....");
		}
	}
}
