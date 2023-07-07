package assiginment2;

public class CB3 {

	public static void main(String[] args) {
	    explicit();	
		implicit();

	}

	static void explicit() {
		System.out.println("\t Explicite Type casting \nbyte->short->int->long->float->double");
		double d = 10.5;
		System.out.println("The value of double :: " + d);
		float f = (float) d;
		System.out.println("The value of double into float :: " + f);
		long l = (long) d;
		System.out.println("The value of double into long :: " + l);
		int i = (int) d;
		System.out.println("The value of double into int :: " + i);
		short s = (short) d;
		System.out.println("The value of double into short :: " + s);
		byte b = (byte) d;
		System.out.println("The value of double into byte :: " + b+"\n<><><><><><><><><><><><><><><><><><><><>");

	}

	static void implicit() {
		System.out.println("\t Implicit Type casting \nbyte<-short<-int<-long<-float<-double");
		byte b = 23;
		System.out.println("The value of byte :: " + b);
		short s = b;
		System.out.println("The value of byte into short :: " + s);
		int i = b;
		System.out.println("The value of byte into int :: " + i);
		long l = b;
		System.out.println("The value of byte into long :: " + l);
		float f = b;
		System.out.println("The value of byte into float :: " + f);
		double d = b;
		System.out.println("The value of byte into double :: " + d);
	}

}
