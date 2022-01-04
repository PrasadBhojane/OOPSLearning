package InstanceStaticControlFlow;

public class Initialization 
{
	private static String m1(String msg) //static method
	{
		System.out.println(msg);
		return msg;
	}
	public Initialization() // Constructor
	{
		m=m1("1");
	}
	{
		m=m1("2"); // instance block
	}
	String m = m1("3"); //instance variable
	public static void main(String[]args) // main method
	{
		Object o = new Initialization(); // within main method object created
	}
}