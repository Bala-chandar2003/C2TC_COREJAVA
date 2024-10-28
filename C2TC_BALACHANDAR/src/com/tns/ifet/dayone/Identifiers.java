package com.tns.ifet.dayone;

import java.util.Scanner;

public class Identifiers {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		
		int num1 = in.nextInt();
		String name = in.next();
		
		System.out.println("The Number you hva entered is:" + num1);
		System.out.println("Hello " + name);
	}

}
