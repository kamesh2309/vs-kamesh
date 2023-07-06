package assiginment1;

import java.util.Scanner;

public class OB2 {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		display(input);
		input.close();
	}
	static void display(Scanner input) {
		System.out.println("Enter a number to display.....");int num=input.nextInt();
		System.out.println("The number enter by the user is = "+num);
		
	}

}
