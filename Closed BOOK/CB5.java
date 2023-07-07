package assiginment2;

import java.util.Arrays;
import java.util.Scanner;

public class CB5 {
	public static void average(Scanner input) {
		
	 System.out.print("Enter the n value :: ");
    int size=input.nextInt();
	 int a[]=new int[size];
	 System.out.println("<><><><><><><><><><><><><><><><><><><><>");
	 for(int i=0;i<size;i++) {
		 System.out.print("Enter a  "+(i+1)+" number :: ");
		 a[i]=input.nextInt();
		 
	 }
	 System.out.println("Number Entered:: "+Arrays.toString(a));
	int sum=0;
	 for(int x:a) {
		 sum+=x;
	 }
	 System.out.println("Sum of "+size +" number :: ----> "+sum);
	 double avg=sum/size;
	 System.out.println("Average of the Entered number :: "+avg);

	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		average( input);
		input.close();
		

	}

}
