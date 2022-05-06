package com.abstraction;
import java.util.*;

public class Nextline {

	public static void main(String[] args) {
		
     Scanner input= new Scanner(System.in);
     
     System.out.println("Enter the Item ID:-");
     
     String ID = input.nextLine();
     
     System.out.println("Item ID is:-  "   +ID);
     
     System.out.println("Enter the price:-");
     
     float price = input.nextFloat();
     System.out.println("Price is "  +price);
     
    
     
     

	}

}
