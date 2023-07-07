package assiginment2;

import java.util.Arrays;
import java.util.Scanner;

public class CB9 {
	public static void reverse(int[] a) {
		for (int i = 0; i < a.length/2; i++) {

			int temp = a[i];
			a[i] = a[a.length - 1 -i];
			a[a.length - 1 - i] = temp;

		}
		System.out.println("Reverse Arrays ----> " + Arrays.toString(a));

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
		reverse(a);
		input.close();

	}

}
