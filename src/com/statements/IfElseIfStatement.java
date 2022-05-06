package com.statements;

public class IfElseIfStatement {

	public static void main(String[] args)
	{
		
		String S="pen";
		
		if(S=="pencil")
		{
			System.out.println("your stationary is pencil");
		}
		else if(S=="rubber"){
			System.out.println("your stationary is rubber");
		}
		else if(S=="ruler")
		{
			System.out.println("your stationary is ruler");
		}
		else if(S=="scale")
		{
			System.out.println("your stationary is scale");
		}
		else {
			System.out.println("output is  "  +S);
	
		}
	}
	

}
