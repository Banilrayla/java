package com.Loops;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args)
	{
		
		int marks; int Grade;
		
	 Scanner m = new Scanner(System.in);
	 
	 System.out.println("Enter your mark :");
	 
	 int mark  = m.nextInt();
	 
	 if(mark>=85)
	 {
		 System.out.println("Grade :A");
	 }
	 else if(mark>=75)
		 {
		 System.out.println("Grade :B");
		 }
	 else if(mark>=65)
	 {
		 System.out.println("Grade :C");
				 
	 }
	 else if(mark>=55)
	 {
		 System.out.println("Grade :D");
	 }else if(mark>=45)
	 {
		 System.out.println("Grade :E"); 
	 }
			 

	 else
	 {
		 System.out.println("FAIL");
	 
	}
	}}
