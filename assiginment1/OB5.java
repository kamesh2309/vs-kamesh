package assiginment1;

import java.util.Scanner;

public class OB5 {
	static void ascii(Scanner input) {
		System.out.println("Enter a character :: ");char a=input.next().charAt(0);
		int b= a; //implicit type casting happen
		System.out.println("The ASCII value of the enter '"+ a +"' character is :: "+b);
		
	}

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		ascii(input);
		input.close();
	}

}
