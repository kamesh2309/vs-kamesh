package assiginment2;

public class CB18 {
	static final float PI = 3.14f;
	int num = 0;

//	CB18(int num) {
	
//	}one argument constructor and try to instantiate object without parameter is not possible

	public static void main(String[] args) {

		// PI=5.6f;//final variable can't be change one's it is assigned
		CB18 cb = new CB18();
		cb.PI();

	}

	void PI() {
		System.out.println("Acess the static member in Non-Static method :: " + PI);
	}

}
