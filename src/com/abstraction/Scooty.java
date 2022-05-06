package com.abstraction;

class Scooty extends Bike {
	public void run()
	
	{
		System.out.println("running safely");
	}

	public static void main(String[] args) {
		Bike obj=new Scooty();
		obj.run();

	}

}
