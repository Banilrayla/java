package com.scannerclass;

import java.util.*;

public class Studentdata{
	


public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter your name:");
	
	String n = scan.nextLine();
	
	System.out.println("Enter your roll no:  ");
	
	int r =scan.nextInt();
	
	System.out.println("Enter your percentage:");
	
	double p =scan.nextDouble();
	
	System.out.println("name:"  +n+   "roll no:"  +r+   "percentage :"   +p+   "");

}
}
