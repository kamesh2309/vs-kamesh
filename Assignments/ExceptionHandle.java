package com.assignments;

import java.util.Scanner;

public class ExceptionHandle {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
              divi(input);
	}
	public static void divi(Scanner input) {
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

}
