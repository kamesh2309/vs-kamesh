package assiginment1;

import java.util.Scanner;

public class OB6 {
	static void divide(Scanner input) {
		System.out.println("The a Dividend :: ");int a =input.nextInt();
		System.out.println("The a Divisor :: ");int b =input.nextInt();
		System.out.println("Quotient\n"+a+" / "+b+" = "+(a/b));
		System.out.println("remainder\n"+a+" % "+b+" = "+(a%b));
		
	}

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		divide(input);
		input.close();
	}

}
