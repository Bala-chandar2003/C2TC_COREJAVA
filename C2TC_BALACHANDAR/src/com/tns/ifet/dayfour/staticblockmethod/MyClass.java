package com.tns.ifet.dayfour.staticblockmethod;
public class MyClass {
	private int section ; 
	private static int srNo; 
	
	static
	{
		System.out.println("This is static block");
		srNo=1000;
	}
	
	MyClass()
	{
		System.out.println("Default Constructor block");
		srNo++;
		section++;		
	}
	
	public String toString() {
		return "MyClass [Serial No "+srNo+", Section=" + section + "]";
	}

	static void display() 
	{
		System.out.println("Serial No. "+srNo); 
	}
}