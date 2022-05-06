package com.abstraction;

public class Servicecentre extends Vehicle1 {
		
		   public void rework()
		    {
		    	System.out.println("the door has tobe chnged");
		    }
			
		public static void main(String[] args) {
			
		 Servicecentre s= new Servicecentre();
		s.repair();
		s.rework();
}
}