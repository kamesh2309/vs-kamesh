package com.assignments;

import java.util.Scanner;

public class CalculationArea {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		Shape s1=new Circle();
		s1.calclationArea(input);
		Shape s=new Rectangle();
		s.calclationArea(input);
		input.close();

	}

}
abstract class Shape{
	public abstract void calclationArea(Scanner input);

}
class Rectangle extends Shape {

	public void calclationArea(Scanner input) {
		System.out.println("Enter a length :: ");int l=input.nextInt();
		System.out.println("Enter a breath :: ");int b=input.nextInt();
		System.out.println("Area of Rectangle :: "+l*b);
	}

}
class Circle extends Shape {

	public void calclationArea(Scanner input) {
		System.out.println("Enter a radius :: ");int r=input.nextInt();

		System.out.println(Math.PI*(r*r));
	}

}