package com.assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class DataBase {
	Empolyees e;
	ArrayList<Empolyees> info = new ArrayList<>();

	public void addDetails(Scanner input) {
		System.out.println("Enter a name of the Empolyee :: ");
		String name = input.next();
		System.out.println("Enter a Empolyee Age  :: ");
		int age = input.nextInt();
		System.out.println("Enter a Empolyee designation :: ");
		String pos = input.next();
		System.out.println("Enter a Empolyee Salary :: ");
		double sal = input.nextDouble();
		Empolyees emp = new Empolyees(name, age, pos, sal);
		addEmpolyeeDetails(emp);

	}

	public void addEmpolyeeDetails(Empolyees emp) {

		while (true) {
			info.add(emp);
			break;
		}
		System.out.println("Sucessfully Added***********\n");

	}

	public void search(Scanner input) {
		System.out.print("Enter a Empolyee name to Search :: ");
		String name = input.next();
		boolean flag = true;
		for (int i = 0; i < info.size(); i++) {
			e = info.get(i);
			if (e.getName().equalsIgnoreCase(name)) {
				System.out.println(e);
				flag = false;
			}

		}
		if (flag) {
			System.err.println("kindly Enter a correct Details to Search____________\n");
		}

	}

	public void display(Scanner input) {
		for (int i = 0; i < info.size(); i++) {
			System.out.println(info.get(i));
		}

	}

	public void update(Scanner input) {
		System.out.println("Enter a name to update ::");
		String name = input.next();
		boolean flag = true;
		for (int i = 0; i < info.size(); i++) {
			e = info.get(i);
			if (e.getName().equalsIgnoreCase(name)) {
				System.out.println("Enter a age to update :: ");
				int age = input.nextInt();
				e.setAge(age);
				System.out.println("information Updated...............\n");
				flag = false;
			}
		}
		if (flag) {
			System.err.println("kindly Enter a correct Details to update___________\n");
		}
	}

	public void delete(Scanner input) {
		System.out.println("Enter a name to Remove ::");
		String name = input.next();
		boolean flag = true;
		for (int i = 0; i < info.size(); i++) {
			e = info.get(i);
			if (e.getName().equalsIgnoreCase(name)) {
				info.remove(i);
				System.out.println("Removed ................\n");
				flag = false;
			}
		}
		if (flag) {
			System.err.println("kindly Enter a correct Details to Detele_________\n");
		}

	}

}
