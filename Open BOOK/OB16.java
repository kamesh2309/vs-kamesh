package assiginment1;

import java.util.Scanner;

public class OB16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter option \n1--> Add \n2-->Multpily");
		int option = input.nextInt();
		switch (option) {
		case 1:
			OB1.add(input);
			break;
		case 2:
			OB3.mult(input);
			break;
		default:
			System.err.println("INVALID OPTION>>>>>>");
		}
		input.close();
	}

}
