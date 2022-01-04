package com.overriding;

class D
{
	public void m1()
	{
		System.out.println("Parent");
	}
}
class E extends D
{
	public void m1()
	{
		System.out.println("Child");
	}
}
class Test3
{
	public void main(String[]args)
	{
		D d = new D();
		d.m1();
		E e = new E();
		e.m1();
		D d1 = new E();
		d1.m1(); // in Overriding is always takes care by JVM-
                 // based on Runtime Object.
	}
}
//code not running here, check on CMD
// Durga VID NO.56 - playtime: 1:15:10