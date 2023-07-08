package com.assignment4;

public class Empolyees {
	
	private String name ;
	private int age;
	private String designation;
	private double sal;
	public Empolyees (){
		
	}
	public Empolyees(String name, int age, String designation, double sal) {
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.sal = sal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getDesignation() {
		return designation;
	}
	public double getSal() {
		return sal;
	}
	@Override
	public String toString() {
		return "Empolyees [name=" + name + ", age=" + age + ", designation=" + designation + ", sal=" + sal + "]";
	}
	


}
