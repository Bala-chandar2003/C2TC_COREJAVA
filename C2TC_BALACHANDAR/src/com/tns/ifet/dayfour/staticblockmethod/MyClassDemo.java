package com.tns.ifet.dayfour.staticblockmethod;

public class MyClassDemo {

	public static void main(String[] args) {
		MyClass obj1 = new MyClass();
		System.out.println(obj1);

		MyClass.display();

		MyClass obj2 = new MyClass();
		System.out.println(obj2);
		MyClass.display();
		MyClass obj3 = new MyClass();
		System.out.println(obj3);
		MyClass.display();

	}

}
