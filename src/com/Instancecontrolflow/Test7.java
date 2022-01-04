package com.Instancecontrolflow;

class Test7 
{
	int i = 10;
	{
		m1(); // instance method
		System.out.println("First Inastance Block");
	}
	Test7() //constructor
	{
		System.out.println("Constructor");
	}
	public static void main(String[]args)
	{
		Test7 t = new Test7(); // if we do not create object then only static control flow will be executed and output will be "Main" only.
		System.out.println("Main");
	}
	public void m1()
	{
		System.out.println(j); // instance block
	}
	{
		System.out.println("Second Instance Block");
	}
		int j = 20;
}
//INSTANCE CONTROL FLOW EXECUTION:
//1) Identification of Instance members from top to bottom
//2) Execution of instance variable assignments and instance blocks from top to bottom.
//3) Execution of Constructor.