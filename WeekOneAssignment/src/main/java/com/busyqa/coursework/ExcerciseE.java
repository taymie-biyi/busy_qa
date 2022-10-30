package com.busyqa.coursework;

import java.util.Scanner;

public class ExcerciseE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mys = new Scanner(System.in);
		   
		System.out.print("Input first number: ");
		int num1 = mys.nextInt();
		   
		System.out.print("Input second number: ");
		int num2 = mys.nextInt();
		
		int obj = num1 * num2;
		   
		System.out.println("The product of " + num1 + " and " + num2 + " is: " + obj);
	}

}
