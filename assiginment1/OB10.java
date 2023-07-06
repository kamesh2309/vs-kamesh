package assiginment1;

import java.util.Scanner;

public class OB10 {
	static void swap(Scanner input) {
		System.out.println("Enter TWO number to Swap :: ");float a=input.nextFloat();float b=input.nextFloat();
		System.out.println("BEFORE Swap [ "+ a+" , "+b+" ]");
		float temp=a;
		a=b;
		b=temp;
		System.out.println("AFTER Swap [ "+ a+" , "+b+" ]");

	}

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		swap(input);
		input.close();

	}

}
