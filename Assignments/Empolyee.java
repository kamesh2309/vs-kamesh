package com.assignments;

public class Empolyee extends Person {
	private int empId;
	private double sal;

	public Empolyee() {
	}

	public Empolyee(int empId, double sal) {
		this.empId = empId;
		this.sal = sal;
	}

	public int getEmpId() {
		return empId;
	}

	public double getSal() {
		return sal;
	}

	@Override
	public String toString() {
		return "Empolyee [EmpId=" + getEmpId() + ", Sal=" + getSal() + "]";
	}
	public static void main(String[] args) {
		Empolyee emp=new Empolyee(101,45000);
		System.out.println(emp);
	}

}
