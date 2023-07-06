package assiginment1;

import java.util.Scanner;

public class OB11 {

	static void oddOrEven(Scanner input) {
		System.out.println("Enter a number to check :: ");int a =input.nextInt();
		if(a%2==0) {
			System.out.println("Enter number "+a+" is Even number");
		}
		else
		{
			System.out.println("Enter number "+a+" is ODD number");
		}
		
	}
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			oddOrEven(input);
			input.close();

		}

}
