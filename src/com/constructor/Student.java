package com.constructor;

class Student
{
	String Name;
	int Rollno;
	
	Student(String Name, int Rollno) // Constructor
	{
		this.Name=Name; //lines to perform initialization of an object
		this.Rollno=Rollno;
	}
	public static void main(String[]args)
	{
		Student s1 = new Student("Durga",101);
		Student s2 = new Student("Prasad",102);
	}
}
//code not running here, check on CMD
//durga vid no. 64