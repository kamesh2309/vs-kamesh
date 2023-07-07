package assiginment2;

import java.util.Arrays;
import java.util.Scanner;

public class CB7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		 System.out.print("Enter the n value :: ");
	    int size=input.nextInt();
		 int a[]=new int[size];
		 System.out.println("<><><><><><><><><><><><><><><><><><><><>");
		 for(int i=0;i<size;i++) {
			 System.out.print("Enter a  "+(i+1)+" number :: ");
			 a[i]=input.nextInt();
			 
		 }
		 System.out.println("Entered Elements :: "+Arrays.toString(a));
		acsending(a);
		descending(a);
		input.close();
	}

	public static void acsending(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Acsending Arrays ----> "+Arrays.toString(a));

	}

	public static void descending(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Decsending Arrays ----> "+Arrays.toString(a));
	}

}
