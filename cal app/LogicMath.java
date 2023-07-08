package com.assignment;

import java.util.Scanner;
import java.lang.Math;

public class LogicMath {

	public void add(Scanner input) {
		System.out.println("____________________________");
		System.out.println("\n*********U seleced Addition operation*********");

		while (true) {
			System.out.println("Enter a  number to Add Press 0 to End ");
			try {
				int sum = 0;
				while (true) {
					int num = input.nextInt();
					sum += num;
					if (num == 0) {
						break;
					}
				}
				System.out.println("The Sum of the Entered number is :: " + sum);
				break;
			} catch (Exception e) {
				System.err.println("Kindly Enter a number to perform operation....");
				input.next();

			}
		}

	}

	public void sub(Scanner input) {
		System.out.println("____________________________");
		System.out.println("\n*********U seleced Subtraction operation*********");
		while (true) {
			System.out.println("Enter a  number two number to sub ");
			try {

				int n1 = input.nextInt();
				int n2 = input.nextInt();
				System.out.println("The Subtraction of the Given number is :: " + (n1 - n2));
				break;
			} catch (Exception e) {
				System.err.println("Kindly Enter a number to perform operation....");
				input.next();
			}
		}

	}

	public void mult(Scanner input) {
		System.out.println("____________________________");
		System.out.println("\n*********U seleced Multiplication operation*********");
		while (true) {
			System.out.println("Enter a  number two number to Multipliy ");
			try {

				int n1 = input.nextInt();
				int n2 = input.nextInt();
				System.out.println("The Subtraction of the Given number is :: " + (n1 * n2));
				break;
			} catch (Exception e) {
				System.err.println("Kindly Enter a number to perform operation....");
				input.next();
			}
		}

	}

	public void divi(Scanner input) {
		System.out.println("____________________________");
		System.out.println("\n*********U seleced Division operation*********");
		while (true) {

			try {
				System.out.print("Enter a  Divident :: ");
				int n1 = input.nextInt();
				System.out.print("Enter a  Divisor  :: ");
				int n2 = input.nextInt();
				System.out.println("The quotient of the Given number is :: " + (n1 / n2));
				break;
			} catch (ArithmeticException a) {
				System.err.println("The divident can't be zero infinte is not supported...");

			} catch (Exception e) {
				System.err.println("Kindly Enter a number to perform operation....");
				input.next();
			}
		}

	}

	public void power(Scanner input) {
		System.out.println("____________________________");
		System.out.println("\n*********U seleced Power Calculation operation*********");
		while (true) {

			try {
				System.out.print("Enter 'n' value :: ");
				int n1 = input.nextInt();
				System.out.print("Enter 'x' value :: ");
				int n2 = input.nextInt();
				System.out.println("The Subtraction of the Given number is :: " + (Math.pow(n1, n2)));
				break;
			} catch (Exception e) {
				System.err.println("Kindly Enter a number to perform operation....");
				input.next();
			}
		}

	}

	public void square(Scanner input) {
		System.out.println("____________________________");
		System.out.println("\n*********U seleced square root operation*********");
		while (true) {

			try {
				System.out.print("Enter 'n' value :: ");
				int n1 = input.nextInt();
				int res = (int) Math.sqrt(n1);
				System.out.println("The Subtraction of the Given number is :: " + (res));
				break;
			} catch (Exception e) {
				System.err.println("Kindly Enter a number to perform operation....");
				input.next();
			}
		}
	}

	public void reminder(Scanner input) {
		System.out.println("____________________________");
		System.out.println("\n*********U seleced Division operation*********");
		while (true) {

			try {
				System.out.print("Enter a  Divident :: ");
				int n1 = input.nextInt();
				System.out.print("Enter a  Divisor  :: ");
				int n2 = input.nextInt();
				System.out.println("The remainder of the Given number is :: " + (n1 % n2));
				break;
			} catch (ArithmeticException a) {
				System.err.println("The divident can't be zero infinte is not supported...");

			} catch (Exception e) {
				System.err.println("Kindly Enter a number to perform operation....");
				input.next();
			}
		}

	}

	public void factorial(Scanner input) {
		System.out.println("____________________________");
		System.out.println("\n*********U seleced factorial operation*********");
		while (true) {

			try {
				System.out.print("Enter number to find factorial :: ");
				int num = input.nextInt();
				int prod=1;
				for(int i=1;i<=num;i++) {
					prod*=i;
				}
				System.out.println("The factorial of the Given number is :: " + prod);
				break;
			} catch (Exception e) {
				System.err.println("Kindly Enter a number to perform operation....");
				input.next();
			}
		}
		
	}

}
