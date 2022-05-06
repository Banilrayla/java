package com.statements;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		int passMark, markObtained;
		
		passMark=35;
		char Grade;
		
	Scanner mark =new Scanner(System.in);
	
	System.out.println("Input marks scored by you");
	
	markObtained = mark.nextInt();
	
	
	
	if(markObtained>=passMark)
	{
	if (markObtained>90)
		Grade = 'A';
		else if(markObtained>80)
			Grade= 'B';
		else if(markObtained>70)
			Grade= 'C';
		else if(markObtained>50)
			Grade= 'D';
		
		else
			Grade='F';
		System.out.println("you passed:"       +Grade);
	}
		else {
		      Grade = 'F';
		      System.out.println("You failed: "       +Grade);
		}
	}


	}

