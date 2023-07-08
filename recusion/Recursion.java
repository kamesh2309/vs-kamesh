package com.assignment2;

import java.util.Scanner;

public class Recursion {
	static {
		System.out.println("\t*****Welcome to Math App*****");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LogicRecursion logic=new LogicRecursion();
		boolean flag=true;
		while(flag) {
			try{
				System.out.println("Enter option to perform a operation\n1->Sum of number\n2->Factorial\n3->Fibonacci Series\n4->Exit");
				int option = input.nextInt();
				switch (option) {
				case 1:logic.sumOfNumber(input);break;
				case 2:logic.factorial(input);
				case 3:logic.fibonacci(input);
				case 4:flag=false;break;
				default:System.err.println("Select the correct option .....");
				}
			}
			catch(Exception e) {
				System.err.println("Kindly enter a number ");input.next();
			}
			finally {
				System.out.println("Thanks for choice the app....");
			}
		}
		
		input.close();
	}

}
