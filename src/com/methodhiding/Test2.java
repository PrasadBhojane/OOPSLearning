package com.methodhiding;

class P
{
	public static void m1()
	{
		System.out.println("Parent");
	}
}
class C extends P
{
	public static void m1() //due to static keyword in both method (i.e. Parent & Child) is method hiding and not overriding.
	{
		System.out.println("Child");
	}
}
public class Test2
{
	public static void main(String[]args)
	{
		P p = new P();
		p.m1();
		C c = new C();
		c.m1();
		P p1 = new C();
		p1.m1(); // in METHOD HIDING is always takes care by compiler-
		         // based on Reference type.
	}
}
//durga vid no.56