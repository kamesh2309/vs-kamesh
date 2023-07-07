package assiginment2;

import java.util.Scanner;

public class CB21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		largeNumber(input);

		input.close();
	}

	static void largeNumber(Scanner input) {
		System.out.print("Enter number of Row :: ");
		int row = input.nextInt();
		System.out.print("Enter number of Coloumn :: ");
		int coloumn = input.nextInt();

		int a[][] = new int[row][coloumn];
		System.out.println("<><><><><><><><><><><><><><><><><><><><>");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++) {
				System.out.print("Enter value row (" + i + ") coloumn (" + j + ") ::");
				a[i][j] = input.nextInt();

			}

		}
		System.out.println("Enter matix <><><><<><><><><><");
		int max = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++) {
				System.out.print(a[i][j] + " ");
				if (a[i][j] > max) {
					max = a[i][j];
				}

			}
			System.out.println();

		}
		System.out.println("Large number present in Matxis :: " + max);
	}

}
