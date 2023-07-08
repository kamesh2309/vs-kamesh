package com.assignment3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraysAssiginment {
	static {
		System.out.println("\t*****Welcome(^_^)*****");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LogicArrays logic = new LogicArrays();
		System.out.print("Enter a element Size :: ");
		int size = input.nextInt();
		int[] a = new int[size];
		while(true){
			try {

				for (int i = 0; i < size; i++) {
					System.out.print("Enter the " + (1 + i) + " Element :: ");
					a[i] = input.nextInt();// Array Initialization:
				}
				break;

			}

			catch(InputMismatchException obj) {
				System.err.println("*****Enter a number kindly Enter again*****\n_____________________");input.next();
			}
		}boolean flag=true;
		while (flag) {
			try {
				System.out.println("Enter a option \n1->view Arrays element\n2->Sum the Arrays element\n3->To view Array Average\n4->Sorted Array\n5->Maximum and Minimum Element\n6->Search Element\n7->Modification in Element\n8-> Exit");
				int option = input.nextInt();
				switch (option) {
				case 1:System.out.println("Entered Arrays Element --> " + Arrays.toString(a));break;// Display an Arrays
				case 2:logic.sumArrays(a);break;//sum the Arrays Element
				case 3:System.out.println("The Average of the Enterted Element --> "+(logic.average(a)/size));break;//Average of An Arrays
				case 4:Arrays.sort(a); System.out.println("The Assending order of the Element --> "+Arrays.toString(a)); break;
				case 5:logic.max(a);break;
				case 6:logic.search(a,input);break;
				case 7:logic.Modifi(a,input);break;
				case 8:flag=false;break;
				default:System.err.println("Enter a correct option <^_^>\n*************************");
				}

			} catch (Exception e) {
				System.err.println("*****Enter a number kindly Enter again*****\n_____________________");
				input.next();
			}
			finally {
				System.out.println("Thanks for choice the app....(^_^)");
			}

		}
	}

}
