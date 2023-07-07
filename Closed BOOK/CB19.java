package assiginment2;

import java.util.Scanner;

public class CB19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number to change :: ");
		int num = input.nextInt();
		int rev = 0,num1=num;
		while (num1 > 0) {
			int last = num1 % 10;
			rev = (rev * 10) + last;
			num1 /= 10;

		}

		while (rev > 0) {
			
			
			int last = rev % 10;
			if (last == 1) {
				System.out.print("one ");
			} else if (last == 2) {
				System.out.print("Two ");
			} else if (last == 3) {
				System.out.print("Three ");
			} else if (last == 4) {
				System.out.print("Four ");
			} else if (last == 5) {
				System.out.print("Five ");
			} else if (last == 6) {
				System.out.print("Six ");
			} else if (last == 7) {
				System.out.print("Seven ");
			} else if (last == 8) {
				System.out.print("Eight ");
			} else if (last == 9) {
				System.out.print("Nine ");
			} else {
				System.out.println("zero ");
			}
			rev/=10;

		}

		input.close();
	}

}
