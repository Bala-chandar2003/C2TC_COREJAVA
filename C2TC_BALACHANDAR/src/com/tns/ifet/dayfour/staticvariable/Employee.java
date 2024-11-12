package com.tns.ifet.dayfour.staticvariable;

public class Employee {
	private String name;
	private int id;
	
	static String companyname = "IFET";
	
	Employee(String name,int id){
		this.name = name;
		this.id= id;	
	}
	public String tostring() {
		return "Employee [name=" + name + ", id=" + id + ", Company= "+companyname+"]";
}
}

