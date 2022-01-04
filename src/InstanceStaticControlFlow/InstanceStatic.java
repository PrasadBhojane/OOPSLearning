package InstanceStaticControlFlow;

class InstanceStatic 
{
	{
		System.out.println("1st Instance Block");
	}
	static
	{
		System.out.println("1st Static Block");
	}
	InstanceStatic() // Constructor
	{
		System.out.println("Constructor");
	}
	public static void main(String[]args)
	{
		InstanceStatic IS1 = new InstanceStatic();
		System.out.println("Main");
		InstanceStatic IS2 = new InstanceStatic(); // For every object Instance control flow will be repeated.
	}
	static
	{
		System.out.println("2nd Static Block");
	}
	{
		System.out.println("2nd Instance Block");
	}
}
//Durga vid no.63