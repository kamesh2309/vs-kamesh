package assiginment1;

import java.util.Scanner;

public class OB9 {
	static void largeNumber(Scanner input) {
		System.out.println("Enter a Three number :: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if (a > b && a > c) {
			System.out.println("The number " + a + " is larger");
		} else if (b > c) {
			System.out.println("The number " + b + " is larger");
		} else {
			System.out.println("The number " + c + " is larger");
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		largeNumber(input);
		input.close();

	}

}
