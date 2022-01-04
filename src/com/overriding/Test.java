package com.overriding;

class P
{
	public void property()
	{
		System.out.println("Cash+Land+Gold");
	}
	public void marry()
	{
		System.out.println("ShubhLakshmi"); //overridden method
	}
}
class C extends P
{
	public void marry()
	{
		System.out.println("Nisha"); // overriding method
	}
}
class Test 
{
	public static void main(String[]args)
	{
		P p = new P();
		p.marry();
		C c = new C();
		c.marry();
		P p1 = new C();
		p1.marry(); // in overriding method resolution is always done by JVM based-
		            // on Runtime object.
	}
}