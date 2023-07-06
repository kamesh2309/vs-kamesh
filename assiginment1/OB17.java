package assiginment1;

import java.util.Scanner;

public class OB17 {

	static void nestedSwitch(Scanner input) {
		System.out.println("Enter a option \n1--> Testing \n2--> Developent");
		int option = input.nextInt();
		switch (option) {
		case 1:
			System.out.println("Enter \n1-->Manual Testing \n2-->Automation Testing");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Thanks for Selection of Manual Testing.....");
				break;
			case 2:
				System.out.println("Thanks for Selection of Automation Testing.....");
				break;
			default:
				System.err.println("INVALID OPTION......");

			}
			break;
		case 2:
			System.out.println("Enter \n1-->Full Stack \n2-->core java");
			int choice1 = input.nextInt();
			switch (choice1) {
			case 1:
				System.out.println("Thanks for Selection of Manual Testing.....");
				break;
			case 2:
				System.out.println("Thanks for Selection of Automation Testing.....");
				break;
			default:
				System.err.println("INVALID OPTION......");

			}
			break;
			default:System.err.println("INVALID OPTION.......");
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		nestedSwitch(input);
		input.close();

	}

}
