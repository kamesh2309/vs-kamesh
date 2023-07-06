package assiginment1;

import java.util.Scanner;

public class OB13 {
	static void pyramid(int num) {
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("----------------");
	}

	static void pyramidReverse(int num) {
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(i+j<=num-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-----------------");


	}

	static void floydTriangle(int num) {
		int n=1;
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(n++ +" ");
				
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Hight of Pyramid :: ");int num=input.nextInt();
		pyramid(num);
		pyramidReverse(num);
		floydTriangle(num);
		input.close();
		

	}

}
