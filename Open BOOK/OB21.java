package assiginment1;

import java.util.Arrays;
import java.util.Scanner;

public class OB21 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	 System.out.println("Enter the Size of an Array....");
	 int size=input.nextInt();
	 int a[]=new int[size];
	 for(int i=0;i<size;i++) {
		 System.out.println("Enter a number to Add "+i+" index value");
		 a[i]=input.nextInt();
		 
	 }
	 System.out.println("Added Arrays Elements are :: "+Arrays.toString(a));
	int sum=0;
	 for(int x:a) {
		 sum+=x;
	 }
	 System.out.println("Sum of Arrays Element :: ----> "+sum);
	 input.close();

	}

}
