package assiginment2;

import java.util.Scanner;

public class CB4 {
	static void isPrime(Scanner input) {
		System.out.print("Enter a number to check :: ");
		int num = input.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
				if (count > 2) {
					break;
				}
			}

		}
		if (count == 2) {
			System.out.println("Enter number " + num + " Prime Number");
		} else {
			System.out.println("Enter number " + num + " not Prime Number");
		}

	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		isPrime( input);
		input.close();
	}

}
