package assiginment2;

import java.util.Arrays;
import java.util.Scanner;

public class CB6 {
	static void cantReSize(Scanner input) {
		System.out.println("--------Can't ReSizeable Array---------");
		int a[] = new int[5];
		System.out.println("_______ Enter only 5 number_______ ");
		System.out.println("<><><><><><><><><><><><><><><><><><><><>");
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter a  " + (i + 1) + " number :: ");
			a[i] = input.nextInt();

		}
		System.out.println("Number Entered:: " + Arrays.toString(a));
		
		

	}
	 static void reSize(Scanner input) {
		 
System.out.println("--------ReSizeable Array---------");
		System.out.print("Enter the n value :: ");
		int size = input.nextInt();
		int a[] = new int[size];
		System.out.println("<><><><><><><><><><><><><><><><><><><><>");
		for (int i = 0; i < size; i++) {
			System.out.print("Enter a  " + (i + 1) + " number :: ");
			a[i] = input.nextInt();

		}
		System.out.println("Number Entered:: " + Arrays.toString(a));
		

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		reSize(input);
		cantReSize(input);
		input.close();

	}

	

}
