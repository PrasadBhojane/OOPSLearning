package com.oopsLearning;

public class OverloadingCase2 
{
	public void m1(String s)
	{
		System.out.println("String version");
	}
	public void m1(Object o)
	{
		System.out.println("Object version");
	}
	public static void main(String[]args)
	{
		OverloadingCase2 o = new OverloadingCase2();
		o.m1(new Object());
		o.m1("durga");
		o.m1(null); 
		//null argument comes in both object and string version
		//Object is parent and string is child, if work is completed at child level then child gets more priority.
	}
}
// while resolving overloaded methods compiler will always-
// -gives presidence to child type argument than compared with-
// parent type argument.