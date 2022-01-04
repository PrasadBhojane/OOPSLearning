package InstanceStaticControlFlow;

public class Test8 
{
	int x = 10; //instance variable
	public static void main (String[]args)
	{
		//System.out.println(x); - CE: non-static variable x can't be referenced from a static content.
		
		Test8 t = new Test8();
		System.out.println(t.x);
	}
}
//note - from static area we can't access instance members directly-
//  - because while executing static area JVM may not identify instance members.
// for that we have to create object to identify instance member from static area.
