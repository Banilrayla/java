package com.abstraction;

public class Developer implements FrontEnd, DatabaseTeam,Backend1
{

	@Override
	public void writecode() {
		System.out.println("CODE");
		
	}

	@Override
	public void MemoryAllocation() {
	System.out.println("Memory");	// TODO Auto-generated method stub
		
	}

	@Override
	public void userInterface() {
	System.out.println("interface");	// sysoutTODO Auto-generated method stub
		
	}



	public static void main(String[] args) {
		Developer s= new Developer();
		s.userInterface();
		s.MemoryAllocation();
		s.writecode();
		// TODO Auto-generated method stub.
	}

}
