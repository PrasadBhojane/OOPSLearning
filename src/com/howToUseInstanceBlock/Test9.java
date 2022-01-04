package com.howToUseInstanceBlock;

public class Test9 
{
	static int count = 0;
	{
		count++; // instance block
	}
	Test9() // constructor
	{
	}
	Test9(int i) // constructor
	{
	}
	Test9(double d) // constructor
	{
	}
	public static void main (String[]args)
	{
		Test9 t1 = new Test9();
		Test9 t2 = new Test9(10);
		Test9 t3 = new Test9(10.5);
		System.out.println("the no. of Object created = "+count);
	}
}
