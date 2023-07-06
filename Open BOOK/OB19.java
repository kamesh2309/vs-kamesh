package assiginment1;

import java.util.Scanner;

public class OB19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		numberReverse(input);
		input.close();

	}

	static void numberReverse(Scanner input) {
		System.out.print("Enter a number to reverse :: ");
		int num = input.nextInt();
		int rev = 0;
		while (num > 0) {
			int last = num % 10;
			rev = (rev * 10) + last;
			num /= 10;

		}
		System.out.println("The Reverese given Number is :: " + rev);

	}

}
