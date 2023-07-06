package assiginment1;

import java.util.Scanner;

public class OB1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		add(input);
		input.close();
	}

	public static void add(Scanner input) {
		System.out.println("Enter a number a :: ");int a = input.nextInt();
		System.out.println("Enter a number b :: ");int b = input.nextInt();
		System.out.println("Addintion of "+a+" + "+b+" number :: "+(a+b));

	}

}
