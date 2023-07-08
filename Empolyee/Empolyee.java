package com.assignment4;

import java.util.Scanner;

public class Empolyee {
	static {
		System.out.println(" \tWelecome to VastPRO Company <^_^>");
	}
	static DataBase data = new DataBase();

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		addInfo(input);
		input.close();
	}

	private static void addInfo(Scanner input) {
		boolean flag = true;

		while (flag) {
			try {
				System.out.println("Select an option \n1->Add empolyee\n2->Display\n3->Search\n4->Update\n5->Delete\n6->Exit");
				int option = input.nextInt();
				switch (option) {
				case 1:data.addDetails(input);break;
				case 2:data.display(input);;break;
				case 3:data.search(input);break;
				case 4:data.update(input);break;
				case 5:data.delete(input);break;
				case 6: flag=false;break;
				default:System.out.println("Enter a worng option______________\n");

				}
			} catch (Exception e) {
				System.err.print("*****Enter a correct information *****\n_______________\n");
				input.next();
			} finally {
				System.out.println("Have a nice day.......\n");
			}
		}

	}
}
