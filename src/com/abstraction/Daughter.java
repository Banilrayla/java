package com.abstraction;

public class Daughter implements Father, Mother {
	

	
	@Override
	public void Jewellery() {
		System.out.println("Ring");
		
	}

	@Override
	public void Bike() {
		System.out.println("Scooty");// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		Daughter a = new Daughter();
			a.Bike();
			a.Jewellery();
				
	}

}
