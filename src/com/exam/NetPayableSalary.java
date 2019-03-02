package com.exam;

import java.util.Scanner;

public class NetPayableSalary {
	public static void main(String args[]){
		NetPayableSalary net=new NetPayableSalary();
		Scanner in=new Scanner(System.in);
		float basicSal;
		
		System.out.println("please enter your basic salary");
		basicSal=in.nextFloat();
		
		net.netPayable(basicSal);
		
	}
	
	public void netPayable(float sal){
		float HRA,specialAllowance,PF;
		float totalSal;
		HRA=(float) ((50.0/100.0)*sal);
		//System.out.println(HRA);
		specialAllowance=(float) ((75.0/100.0)*sal);
		///System.out.println(specialAllowance);
		PF=(float) ((12.0/100.0)*sal);
		//System.out.println(PF);
		totalSal=sal-HRA+specialAllowance-PF;
		
		System.out.println("the net payable salary is : "+totalSal);
		
		
	}

}

/*wance, which is 75% of the basic salary 
■ PF deduction, which is 12% of the basic salary. */
