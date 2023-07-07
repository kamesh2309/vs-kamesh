package assiginment2;

import java.util.Scanner;

public class CB16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number to check>>>>>");
		int num = input.nextInt();
		armstrongNumber(num);
		palindromNumber(num);
		perfectNumber(num);
		input.close();

	}

	public static void perfectNumber(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		
		if(num==sum) {
			System.out.println(num+" ---------->The given number is Perfect number");
		}

	}

	public static void palindromNumber(int num) {
		int rev = 0,n=num;
		while (num > 0) {
			int last = num % 10;
			rev = (rev * 10) + last;
			num /= 10;

	}
		if(n==rev) {
			System.out.println(n+" ---------->The given number is Palindrom\n");
		}
	}

	public static void armstrongNumber(int num) {
		int n=num,n2=num,sum=0,count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		while(n2>0) {
			int last=n2%10;
			int x=count,prod=1;
			while(x>0) {
				prod*=last;
				x--;
			}
			sum+=prod;
			n2/=10;
		}
		if(sum==num) {
			System.out.println(num+" ----------> The given number is Armstrong number \n");
		}

	}

}
