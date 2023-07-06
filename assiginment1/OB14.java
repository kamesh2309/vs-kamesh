package assiginment1;

import java.util.Scanner;

public class OB14 {

	static void sumOfNumber(Scanner input) {
		System.out.print("Enter any number Below to sum :: ");
		int num = input.nextInt();
		int sum = 0,n=num;
		while (0 < num) {
			sum += num--;
		}
		System.out.println("The Sum of the Given form 0 t0 " + n + " is = " + sum);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		sumOfNumber(input);
		input.close();
	}

}
