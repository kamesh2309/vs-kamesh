package assiginment2;

public class CB25 {
	static double f = 0, s = 0, t = 0;

	public static void main(String[] args) {
		double Principle = 14000;
		firstYear(Principle);
		secondYear(Principle);
		thirdYear(Principle);
	}

	public static void thirdYear(double principle) {
		t = (s * 40) / 100;
		System.out.println("Third year profit :: " + t);

	}

	public static void secondYear(double principle) {
		s = (f + principle) - 1500;
		System.out.println("Second year profit :: " + s);
	}

	public static void firstYear(double principle) {
		f = (14000 * 40) / 100;
		System.out.println("First year profit :: " + f);

	}

}
