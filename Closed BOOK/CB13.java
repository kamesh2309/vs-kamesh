package assiginment2;

import java.util.Scanner;

public class CB13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter Number  of Student :: ");
		int std = input.nextInt();
		String[] name = new String[std];
		for (int i = 0; i < name.length; i++) {
			System.out.print("Enter a name  of the Student " + (i+1) + " :: ");
			name[i] = input.next();
		}

		System.out.print("Enter number of Subject :: ");
		int sub = input.nextInt();

		int a[][] = new int[std][sub];
		System.out.println("<><><><><><><><><><><><><><><><><><><><>");
		for (int i = 0; i < std; i++) {
			for (int j = 0; j < sub; j++) {
				System.out.print("Enter value Student (" + name[i] + ") subject mark (" + (j + 1) + ") ::");
				a[i][j] = input.nextInt();

			}
			System.out.println("<><><><><><><><><><><><><><><><><><><><>");

		}
		
		for (int i = 0; i < std; i++) {
			for (int j = 0; j < sub; j++) {
				if(j==0) {
					System.out.print(name[i]+" ");
				}
				System.out.print(a[i][j] + "  ");

			}
			System.out.println();
		}

		input.close();
	}
}
