package assiginment1;

import java.util.Scanner;

public class OB18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean flag = true;
		while (flag) {
			System.out.println(
					"Enter a option to perform \n1-->Area Of Rectangle\n2-->Area Of Square\n3-->Area Of Triangle\n4-->Area Of Circle\n5-->Prime number\n6-->Exit");
			int option = input.nextInt();
			switch (option) {

			case 1:areaOfRectangle(input);
				break;
			case 2:areaOfSquare(input);
				break;
			case 3:areaOfTriangle(input);
				break;
			case 4:areaOfCircle(input);
				break;
			case 5:isPrime(input);
			case 6:flag = false;
				break;
			default:System.out.println("Enter a worng option Kindly SelectAgain .......");input.next();

			}
		}

		input.close();

	}

	static void isPrime(Scanner input) {
		System.out.println("Enter a number to check :: ");
		int num = input.nextInt();
		int count = 0;
		for (int i = 0; i <= num; i++) {
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

	static void areaOfCircle(Scanner input) {
		System.out.print("Enter a Radius of Circle :: ");
		double r = input.nextDouble();
		double res = Math.PI * (r * r);
		System.out.println("Area of Circle :: " + res);
	}

	static void areaOfTriangle(Scanner input) {
		System.out.println("Enter a Hight and base :: ");
		int h = input.nextInt();
		int b = input.nextInt();
		System.out.println("Area Of Triangle :: " + ((h * b) / 2));
	}

	static void areaOfSquare(Scanner input) {
		System.out.println("Enter the Side of the Square :: ");
		int square = input.nextInt();
		System.out.println("Area of Square :: " + (square * square));
	}

	static void areaOfRectangle(Scanner input) {
		System.out.println("Enter Length & width :: ");
		int length = input.nextInt();
		int width = input.nextInt();
		System.out.println("The Area Of Rectangle is :: " + (length * width));

	}

}
