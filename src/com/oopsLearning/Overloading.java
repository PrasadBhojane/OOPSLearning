package com.oopsLearning;

public class Overloading 
{
	public void m1(int i)
	{
		System.out.println("int-arg");
	
	}
	public void m1(float f)
	{
		System.out.println("float-arg");
	
	}
	public static void main(String[]args)
	{
		Overloading o = new Overloading();
		o.m1(10);
		o.m1(10.5f);
		o.m1('a'); //matched method 'char' not available, so char arguments promoted to the next level i.e. 'int'
		o.m1(10l); //matched method 'long' not available, so char arguments promoted to the next level i.e. 'float'
	}
}
