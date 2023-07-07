package assiginment2;

/*protected */class CB23 { 
// #... illegal modifier outer class only prefixed with default or public
// #...There is no main method so execution can't happen
//#... file name should be class name there is no possible of more than one public class 

	String Method() {
		return "Wow";
	}
}

class dervied {
	public void useD() {
		CB23 z = new CB23();
		System.out.println("base says, " + z.Method());
	}
}
