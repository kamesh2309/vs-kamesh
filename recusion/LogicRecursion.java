package com.assignment2;

import java.util.Scanner;

public class LogicRecursion {

	public void sumOfNumber(Scanner input) {
		while (true) {
			try {
				System.out.print("Enter a number to sum :: ");
				int num = input.nextInt();
				System.out.println(sum(num));
				break;

			} catch (Exception e) {
				System.out.println("Enter a number to perform operation...");
				input.next();
			}
		}

	}

	public void factorial(Scanner input) {
		while (true) {
			try {
				System.out.print("Enter a number to sum :: ");
				int num = input.nextInt();
				System.out.println(fact(num));
				break;

			} catch (Exception e) {
				System.out.println("Enter a number to perform operation...");
				input.next();
			}
		}

	}

	public void fibonacci(Scanner input) {
		while (true) {
			try {
				System.out.print("Enter a number to sum :: ");
				int num = input.nextInt();
				System.out.println(fib(num));
				break;

			} catch (Exception e) {
				System.out.println("Enter a number to perform operation...");
				input.next();
			}
		}

	}

	public int sum(int num) {
		if (num == 1)
			return num;

		return num + sum(num - 1);
	}

	public int fact(int num) {
		if (num <= 1) {
			return 1;
		}
		return num * fact(num - 1);
	}

	public int fib(int num) {
		if (num <= 1) {
			return num;
		}
		return fib(num - 1) + fib(num - 2);
	}

}
