package com.oopsLearning;

public class overloadingCase3 
{
	public void m1(int x)
	{
		System.out.println("General Method");
	}
	public void m1(int... x)
	{
		System.out.println("var-arg method");
	}
	public static void main(String []args)
	{
	overloadingCase3 o = new overloadingCase3();
	o.m1(); // var-arg method
	o.m1(10,20); // var-arg method
	o.m1(10); // can call general method and also var-arg method-
	          // but old method will get the chance i.e. int (general method).
	}
}