package com.assignments;

public class WapperClass {
	static short s;
	static byte b;
	static int i;
	static long l;
	static float f;
	static double d;
	static char c;
	static Short s1;
	static Byte b1;
	static Integer i1;
	static Long l1;
	static Float f1;
	static Double d1;
	static Character c1;

	public static void main(String[] args) {
		// AutoBoxing
		s1=s;
		b1=b;
		i1=i;
		l1=l;
		f1=f;
		d1=d;
		c1=c;
		// UnBoxing 
		s=s1;
		b=b1;
		i=i1;
		l=l1;
		f=f1;
		d=d1;
		c=c1;
		
		
	}

}
