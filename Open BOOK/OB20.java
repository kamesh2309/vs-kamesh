package assiginment1;

import java.util.Scanner;

public class OB20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		displayPrime(input);
		input.close();

	}

	static void displayPrime(Scanner input) {
		System.out.println("Enter a limit to print Prime Number :: ");
		int num = input.nextInt();
		for (int i = 1; i <= num; i++) {
			int count = 0;
			for (int j = 1; i >= j; j++) {
				if (i % j == 0) {
					count++;
					if (count > 2) {
						break;
					}
				}

			}
			if (count == 2) {
				System.out.println("Enter number " + i + " Prime Number\n>>>>>>>>>>>>>>>>>>>>>>");
			}

		}

	}

}
