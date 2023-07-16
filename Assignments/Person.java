package com.assignments;

class Info {
	static int count = 0;
    private String name;
	private int age;
	private String address;

	public Info() {
	}

	public Info(String name, int age, String address) {
		count++;
		this.address = address;
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Info [age=" + age + ", address=" + address + "]";
	}

}

public class Person {

	public static void main(String[] args) {

		Info p1 = new Info("Swetha", 20, " mal bhuvanagri chidambaram");
//		System.out.println("The Name of person is --> " + p.getName() + "\n*******************************");
//		System.out.println("The Age  of person is --> " + p.getAge() + "\n*******************************");
//		System.out.println("The Address of person is --> " + p.getAddress() + "\n*******************************");
		Info p2 = new Info("Kamesh", 24, "New colony 2nd Street perumal kovil nerkundram chennai-107");
		Info p3 = new Info("Guru", 22, "kumbakonam");
		Info p4 = new Info("karthika", 22, "kel bhuvanagri chidambaram");
		System.out.println("The Details of " + p1.getName() + " is :: " + p1 + "\n*******************************");
		System.out.println("The Details of " + p2.getName() + " is :: " + p2 + "\n*******************************");
		System.out.println("The Details of " + p3.getName() + " is :: " + p3 + "\n*******************************");
		System.out.println("The Details of " + p4.getName() + " is :: " + p4 + "\n*******************************");
		System.out.println("Number of person --> "+Info.count);

	}
}
