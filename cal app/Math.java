package com.assignment;

import java.util.Scanner;

public class Math {
	static {
		System.out.println("\t****Welecome to Arithmetic Calcuator****");
	}

	public static void main(String[] args) {
		LogicMath logic=new LogicMath();
		Scanner input = new Scanner(System.in);
		boolean flag=true;
		while(flag) {
			try {
				System.out.println("Enter option to perform a operation\n1->Addition\n2->Subtraction\n3->Multiplication\n4->Division\n5->Power Calculation\n6->square root\n7->Remainder of number\n8->Factorial of number\n9->Exit");
				int option = input.nextInt();
				switch(option) {
				case 1:logic.add(input);break;
				case 2:logic.sub(input);break;
				case 3:logic.mult(input);break;
				case 4:logic.divi(input);break;
				case 5:logic.power(input);break;
				case 6:logic.square(input);break;
				case 7:logic.reminder(input);break;
				case 8:logic.factorial(input);break;
				case 9:flag=false;break;
				default:System.err.println("Selected option is Worng..KIndly Select again");

				}
			}
			catch(Exception e) {
				System.err.println("Enter input is worng kindly Seclect again............ ");input.next(); 

			}
			finally {
				System.out.println("********Thanks for using me (^_^)********");
			}
		}
		input.close();
	}

}
