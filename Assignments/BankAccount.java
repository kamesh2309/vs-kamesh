package com.assignments;

public class BankAccount {
	public static void main(String[] args) {
		Info3 c1 = new Info3(101, 50000.0, "kamesh");
		System.out.println("The Account Number :: "+c1.getAccountNo());//There can't see directly by using getMethod(); 
		System.out.println("The Balance  :: "+c1.getBalance());//There can't see directly by using getMethod();
		System.out.println("The User Name :: "+c1.getCustomerName()+"\n********************");//There can't see directly by using getMethod();
		c1.setCustomerName("Swetha");// There can't modify directly by using setMethod();
		System.out.println("The updated name is :: "+c1.getCustomerName());
		

	}

}

class Info3 {
	private int accountNo;
	private double balance;
	private String customerName;

	public Info3() {
	}

	public Info3(int accountNo, double balance, String customerName) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public double getBalance() {
		return balance;
	}

	
}
