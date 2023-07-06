package assiginment1;

import java.util.Scanner;

public class OB3 {
	static void mult(Scanner input) {
		System.out.println("Enter a number a :: ");int a = input.nextInt();
		System.out.println("Enter a number b :: ");int b = input.nextInt();
		System.out.println("multiply of "+a+" * "+b+" number :: "+(a*b));

	}

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		mult(input);
		input.close();
	}

}
