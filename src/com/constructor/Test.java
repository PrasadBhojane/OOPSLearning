package com.constructor;

/**
 * @author Prasad
 *
 */
public class Test // Overloaded constructor, i.e. with same name but with different arguments
{
	Test()// constructor
	{
		this(10);
		System.out.println("no-arg");
	}
	Test(int i) // constructor
	{
		this(10.5);
		System.out.println("int-arg");
	}
	Test(double d) // constructor
	{
		System.out.println("double-arg");
	}
	public static void main(String[]args)
	{
		Test t1 = new Test();
		Test t2 = new Test(10);
		Test t3 = new Test(10.5);
	    Test t4 = new Test(10l); //automatic promotion of 'long' to 'double'.
	}
}
// For Constructor, Inheritance and Overriding concept is NOT applicable.
// But, Overloading concept is applicable.

//durga vid no. 66