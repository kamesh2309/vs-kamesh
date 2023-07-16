package com.assignments;

public class Music {

	public static void main(String[] args) {
		Piano p =new Piano();
		Guitar g=new Guitar();
		p.play();
		p.play();
	}

}

interface Playable {
	public void play();
}

class Piano implements Playable {
	public void play() {
		System.out.println("U selected Piano (^_^) \n***********************");
	}
}

class Guitar implements Playable {
	public void play() {
		System.out.println("U selected Guitar (^_^) \\n*********************** ");
	}
}