package assiginment2;

import java.util.Arrays;
import java.util.Scanner;

public class CB17 {
	public static void isPresent(int[] a, Scanner input) {
		System.out.print("Enter a Element to find to check  ::");
		int elem = input.nextInt();
		boolean flag = false;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == elem) {
				System.out.println("The Entered " + elem + " Element "+i+" location present ");
				count++;
				flag = true;
			}

		}
		if (flag) {
			System.out.println("The Entered number "+elem+"["+count+"] time present in the Arrays");
			
		} else {

			System.err.println("Not present in the Arrays.....");

		}

	}

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
		System.out.println("__________________________________");
		isPresent(a, input);
		input.close();
	}

}
