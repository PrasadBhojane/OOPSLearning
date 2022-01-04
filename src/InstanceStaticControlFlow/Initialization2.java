package InstanceStaticControlFlow;

public class Initialization2 
{
	private static String m1(String msg) // static method
	{
		System.out.println(msg);
		return msg;
	}
	static String 
	    m = m1("1"); //static variable
	{
		m = m1("2");// instance variable
	}
	static //static block
	{
		m = m1("3");
	}
	public static void main(String []args) // main method
	{
		Object obj = new Initialization2();
	}
}

// durga vid no. 63