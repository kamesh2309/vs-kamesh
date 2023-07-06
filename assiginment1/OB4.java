package assiginment1;

import java.util.Scanner;

public class OB4 {
	static void casting(Scanner input) {
		System.out.println("Enter a number1 to mult :: ");byte a=(byte)input.nextInt();
		System.out.println("Enter a number2 to mult :: ");byte b=(byte)input.nextInt();
		byte res=(byte)(a*b);
		System.out.println("multiply of "+a+" * "+b+" number :: "+res);
		
		
	}

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		casting(input);
		input.close();
	}
	

}
