package com.scannerclass;

import java.util.Scanner;

public class ScannerTask {

 public static void main(String [] args) {
	 Scanner scan =new Scanner(System.in);
	 
	 System.out.println("Enter your name:");
	 
	 String name= scan.next();
	 
	System.out.println("enter your age:"     +name);
	
	int age = scan.nextInt();
	
	System.out.println("Enter your initial");
	String initial = scan.next();
			
			
         
	System.out.println("enter your motto");
	String motto =scan.next();
	motto += scan.nextLine();

	
	System.out.println("hello:    "  +name+   "you are "    +age+   "and your motto is "    +motto+ "");
 }

 }
 

