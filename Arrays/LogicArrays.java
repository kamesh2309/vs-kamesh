package com.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class LogicArrays {

	public void sumArrays(int[] a) {
		int sum = 0;
		for (int x : a) {
			sum += x;
		}
		System.out.println("Sum of an Arrays Element --> " + sum);

	}

	public int average(int[] a) {

		int sum = 0;
		for (int x : a) {
			sum += x;
		}
		return sum;

	}

	public void max(int[] a) {
		int max = 0, min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}

		System.out.println("The Max Value present the Arrays ->" + max + "\n*************************");
		System.out.println("The Max Value present the Arrays ->" + min+"\n*************************");
	}

	public void search(int[] a, Scanner input) {
		System.out.print("Enter a Element to search :: ");
		int x = input.nextInt();
		boolean flag = true;
		for (int b : a) {
			if (x == b) {
				System.out.println("Enter element present in the Arrays (^_^)");
				flag = false;
			}
		}
		if (flag) {
			System.err.println("Enter element not present in the Arrays \5-\5");
		}

	}

	public void Modifi(int[] a, Scanner input) {
		System.out.print("Enter a Element to Modification ::");
		int mod = input.nextInt();
		System.out.print("Enter a Element to Update ::");
		int change = input.nextInt();
		for (int i = 0; i < a.length; i++) {

			if (a[i] == mod) {
				a[i] = change;
				System.out.println("------Sucess fully Changed------\n*************************");
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
