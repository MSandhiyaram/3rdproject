package com.Excercise;

import java.util.Scanner;

public class TimeConverter 
{

	public static void main(String[] args) 
	{
		int days;
		int hours;
		int min;
		int sec;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter day ");
		days=scanner.nextInt();
		hours=days*24;
		min=hours*60;
		sec=min*60;
		System.out.println("************************");
		System.out.println("Hours----> " +hours);
		System.out.println("Min----> "+min);
		System.out.println("Sec----> "+sec);

		scanner.close();

}
}