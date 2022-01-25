package com.Excercise;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) 
	{

		int day;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter day  :   ");
		day=scanner.nextInt();
		switch(day)
		{
		
		case 1:
		System.out.println("Working day ");
		break;
		case 2:  
		System.out.println("Working day ");
		break;
		case 3:
		System.out.println("Working day ");
		break;
		case 4:  
		System.out.println("Working day ");
		case 5:
		System.out.println("Working day ");
		break;
		case 6:  
		System.out.println("Working day ");
		break;
		case 7:  
		System.out.println("Working day ");
		break;
		
		default:
			System.out.println("invalid");
			scanner.close();
		
	}


}
}