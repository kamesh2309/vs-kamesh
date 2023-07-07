package assiginment2;

import java.util.Arrays;
import java.util.Scanner;

public class CB8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the n value :: ");
		int size = input.nextInt();
		int a[] = new int[size];
		System.out.println("<><><><><><><><><><><><><><><><><><><><>");
		for (int i = 0; i < size; i++) {
			System.out.print("Enter a  " + (i + 1) + " number :: ");
			a[i] = input.nextInt();

		}
		System.out.println("Entered Elements :: " + Arrays.toString(a));
		usingElement(a, input);
		System.out.println("__________________________________");
		usingndex(a, input);
		input.close();

	}

	public static void usingndex(int[] a, Scanner input) {
		System.out.print("Enter a index to find the Elements place ::");
		int index = input.nextInt();
		boolean flag = true;
		for (int i = 0; i < a.length; i++) {
			if (i == index) {
				System.out.println("The place of the Entered " + index + " Element :: " + a[i]);
				flag = false;
			}

		}
		if (flag) {

			System.err.println("index Not present in the Arrays.....");

		}

	}

	public static void usingElement(int[] a, Scanner input) {
		System.out.print("Enter a Element to find the index place ::");
		int elem = input.nextInt();
		boolean flag = true;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == elem) {
				System.out.println("The place of the Entered " + elem + " Element :: " + i);
				flag = false;
			}

		}
		if (flag) {

			System.err.println("Not present in the Arrays.....");

		}

	}

}
