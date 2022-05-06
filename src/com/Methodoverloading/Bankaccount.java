package com.Methodoverloading;

public class Bankaccount {

	public void Accountholder(String name) {
		
		System.out.println(name);
		
		
	}
	public void Accountholder(int age, float newDOB ) {
		
       System.out.println(age);
       System.out.println(newDOB);
}
     public  static void main(String[] args) {
    	 
    	 Bankaccount obj = new Bankaccount();
    	 
  		obj.Accountholder("Banil");
  		obj.Accountholder("age");
  		obj.Accountholder("02/2/85");
  		
  				
    	 
    	 
     }

}