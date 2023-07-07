package assiginment2;

public class CB15 {

	public static void main(String[] args) {

		displayPrime();

	}

	static void displayPrime() {

		for (int i = 1; i <= 100; i++) {
			int count = 0;
			for (int j = 1; i >= j; j++) {
				if (i % j == 0) {
					count++;
					if (count > 2) {
						break;
					}
				}

			}
			if (count == 2) {
				System.out.println("Prime number is " + i);
			}

		}

	}
}
