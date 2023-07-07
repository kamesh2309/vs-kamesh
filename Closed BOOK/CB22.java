package assiginment2;

public class CB22 {

	public static void main(String[] args) {
		Modifier mod = new Modifier();
		// mod.n; #............Error
		// mod.privateMethod; #......Error
		System.out.print("From defult :: " + mod.n1+"-->");
		mod.defaultMethod();
		System.out.println("-----------------------------------");
		System.out.print("From protected :: " + mod.n2+"-->");
		mod.protectedMethod();
		System.out.println("-----------------------------------");
		System.out.print("From public :: " + mod.n3+"-->");
		mod.publicMethod();
	
	}

}

class Modifier {
	private int n = 10;

	private void privateMethod() {
		System.out.println("\"I'm private i can be accessed by only within class.....\" ");
	}

	int n1 = 20;

	void defaultMethod() {
		System.out.println("\"I'm Default i can be accwssed by only within package ......\"");
	}

	protected int n2 = 30;

	protected void protectedMethod() {
		System.out.println("\"I'm protected i can be accessed by within package also outside package if inhertance....\"");
	}

	public int n3 = 40;

	public void publicMethod() {
		System.out.println("\"I'm public i can be accessed by anywhere......\" ");
	}
}
