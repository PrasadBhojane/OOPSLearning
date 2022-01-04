package com.overloading;

class Animal 
{
}
class monkey extends Animal
{
}
class Test
{
  public void m1(Animal a)
{
	System.out.println("Animal Version");
}
  public void m1(monkey m)
{
	System.out.println("Monkey Version");
}
  public static void main(String[]args)
{
	Test t = new Test();
	Animal a = new Animal();
	t.m1(a); // animal version
	monkey m = new monkey();
	t.m1(m); // monkey version
	Animal a1 = new monkey();
	t.m1(a1); // animal version - in overloading method resolution always takes care-
	          // by compiler based on reference type. Runtype object never play any role in overloading
}
}
// OVERLOADING - DURGA VID NO.54