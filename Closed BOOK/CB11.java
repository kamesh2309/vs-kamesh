package assiginment2;

import java.util.Scanner;

public class CB11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of Row :: ");
		int row = input.nextInt();
		

		int a[][] = new int[row][row];
		System.out.println("<><><><><><><><><><><><><><><><><><><><>");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("Enter value row (" + i + ") coloumn (" + j + ") ::");
				a[i][j] = input.nextInt();

			}

		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		input.close();
	}

}
