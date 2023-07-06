package assiginment1;

import java.util.Scanner;

public class OB8 {
	static void vowells(Scanner input) {
		System.out.println("Enter a character to check :: ");char a=input.next().charAt(0);
		if(a=='a'|| a=='A'||a=='e'|| a=='E'||a=='i'||a=='I'||a=='o'||a=='O'||a=='u'||a=='U') {
			System.out.println("The Character "+ a+ " is vowells");
		}
		else
		{
			System.out.println("The Character "+ a+ " is not vowells");
		}

	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		vowells(input);
		input.close();
	}

}
