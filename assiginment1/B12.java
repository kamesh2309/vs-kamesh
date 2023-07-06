package assiginment1;

import java.util.Scanner;

public class B12 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number to print :: ");int num=input.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				System.out.println(i+" , "+j);
			}
			System.out.println();
		}
		input.close();
		

	}

}
