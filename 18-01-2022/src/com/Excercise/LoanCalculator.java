package com.Excercise;

import java.util.Scanner;

public class LoanCalculator 
{

	public static void main(String[] args) 
	{

		int amount;
		int i;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter amount  :   ");
		amount=scanner.nextInt();
		for(i=1;i<=3;i++)
		{
			int loan;
			loan=(amount*10)/100;
			amount=amount-loan;
			
			
		}
		
		System.out.println(amount);
		scanner.close();		
}

}