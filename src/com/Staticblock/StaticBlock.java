package com.Staticblock;

class StaticBlock 
{
	static
	{
		System.out.println("Hello I can print");
		System.exit(0);
	}
}
// code not compiled here, because from 1.7 version onward main method is mandatory to start a program execution-
// -hence from 1.7 version onward without writing main method it is impossible to print some statements to the console.
// so, check on CMD..